package com.mentatlabs.nsa
package scalac

import scalax.file._
import scala.collection.immutable.TreeMap

object Lister extends App {
  val sources = Path("nsa-core").toAbsolute /
    "src" / "main" / "scala" /
    "com" / "mentatlabs" / "nsa" / "scalac" / "options"

  val allSources =
    (sources ** "*.scala").toSeq map { source =>
      source -> source.string
    } toMap

  val OptionPattern = "^  ([@-]\\S+.*?)  +(.*)$".r

  val explains = Map(
    ("-d <directory>", "-d <directory|jar>")
  , ("-extdirs <dirs>", "-extdirs <path>")
  , ("-g:<g>", "-g:<level>")
  , ("-language:<feature>", "-language:<_,feature,-feature>")
  , ("-make:<strategy>", "-make:<policy>")
  , ("-Xelide-below", "-Xelide-below <n>")
  , ("-Xlint", "-Xlint:<_,warning,-warning>")
  , ("-Xmax-classfile-name", "-Xmax-classfile-name <n>")
  , ("-Xmigration", "-Xmigration:<version>")
  , ("-Xplugin:<file>", "-Xplugin:<paths>")
  , ("-Ybuilder-debug:<method>", "-Ybuilder-debug:<manager>")
  , ("-Ylinearizer:<Ylinearizer>", "-Ylinearizer:<which>")
  , ("-Ypresentation-delay", "-Ypresentation-delay <n>")
  , ("-Yrecursion", "-Yrecursion <n>")
  , ("-Ysqueeze:<Ysqueeze>", "-Ysqueeze:<enabled>")
  , ("-Ystruct-dispatch:<method>", "-Ystruct-dispatch:<policy>")
  )

  val mergers = Map(
    ("-checknull", "-Xcheck-null")
  , ("-D<prop>", "-Dproperty=value")
  , ("-documenttitle <documenttitle>", "-doctitle <doctitle>")
  , ("-g", "-g:<level>")
  , ("-nopredefs", "-Yno-predef")
  , ("-nouescape", "-Xno-uescape")
  , ("-print:<phase>", "-print")
  , ("-skip:<phase>", "-Yskip:<phases>")
  , ("-statistics", "-Ystatistics:<_,phase,-phase>")
  , ("-stop:<phase>", "-Ystop-after:<phases>")
  , ("-XbytecodeRead", "-Ybytecode-read")
  , ("-Xcloselim", "-Yclosure-elim")
  , ("-Xdce", "-Ydead-code")
  , ("-Xdetach", "-Ydetach")
  , ("-Xinline", "-Yinline")
  , ("-Xlinearizer:<Xlinearizer>", "-Ylinearizer:<which>")
  , ("-XO", "-optimise")
  , ("-Xplugtypes", "-Xplug-types")
  , ("-Xprint-icode", "-Xprint-icode[:phases]")
  , ("-Xprint:<phase>", "-Xprint:<phases>")
  , ("-Xprintpos", "-Xprint-pos")
  , ("-Xscript", "-Xscript <object>")
  , ("-Xshowcls <class>", "-Xshow-class <class>")
  , ("-Xshowicode", "-Xprint-icode[:phases]")
  , ("-Xshowobj <object>", "-Xshow-object <object>")
  , ("-Xshowtrees", "-Yshow-trees")
  , ("-Xwarndeadcode", "-Ywarn-dead-code")
  , ("-Ybrowse:<phase>", "-Ybrowse:<phases>")
  , ("-Ycheck:<phase>", "-Ycheck:<phases>")
  , ("-Ylog:<phase>", "-Ylog:<phases>")
  , ("-Yno-predefs", "-Yno-predef")
  , ("-Yshow:<phase>", "-Yshow:<phases>")
  , ("-Yskip:<phase>", "-Yskip:<phases>")
  , ("-Ystatistics", "-Ystatistics:<_,phase,-phase>")
  , ("-Ystop-after:<phase>", "-Ystop-after:<phases>")
  , ("-Ystop-before:<phase>", "-Ystop-before:<phases>")
  , ("-Ystop:<phase>", "-Ystop-after:<phases>")
  )

  val optionLines =
    ScalacHelp.helps.toSeq flatMap { case (version, help) =>
      val lines = (help.toString split "\n")

      lines collect {
        case OptionPattern(option, description) =>
          explains.get(option) match {
            case Some(name) =>
              name -> ((version, (description, None)))
            case _ =>
              mergers.get(option) match {
                case Some(name) =>
                  name -> ((version, (description, Some(option))))
                case _ =>
                  option -> ((version, (description, None)))
              }
          }
      }
    }

  val legacy = Set(
    "-bottom <pagebottom>"
  , "-browse:<phase>"
  , "-charset <doccharset>"
  , "-check:<phase>"
  , "-debug"
  , "-dependencyfile <file>"
  , "-doc"
  , "-doctitle <doctitle>"
  , "-footer <pagefooter>"
  , "-graph:<phase>", "-header <pageheader>"
  , "-linksource"
  , "-log:<phase>"
  , "-logall"
  , "-make:<policy>"
  , "-migrate"
  , "-noassert"
  , "-nocomment"
  , "-noimports"
  , "-o <file>"
  , "-printer:<printer>"
  , "-printfile <file>"
  , "-printtypes"
  , "-prompt", "-resident", "-shutdown"
  , "-r <path>"
  , "-stylesheetfile <stylesheetfile>", "-top <pagetop>"
  , "-windowtitle <windowtitle>"
  , "-Xassem-extdirs <dirs>"
  , "-Xassem-extdirs <dirs>"
  , "-Xassem-name <file>"
  , "-Xassem-path <path>"
  , "-Xassem <file>"
  , "-XbytecodeRead"
  , "-Xcodebase <codebase>"
  , "-Xgadt"
  , "-Xgenerics"
  , "-XinnerClasses"
  , "-XinnerClasses"
  , "-XinnerClasses"
  , "-XinnerClasses"
  , "-XinnerClasses"
  , "-Xkilloption"
  , "-Xno-varargs-conversion"
  , "-XprintOuterMatches"
  , "-Xsourcedir <directory>"
  , "-Xunapply"
  , "-Xwarninit"
  , "-Ybytecode-read"
  , "-Ycasetags:<Ycasetags>"
  , "-Ycheck:<phases>"
  , "-YclasspathImpl:<implementation>"
  , "-Ycodebase <codebase>"
  , "-Ydependent-method-types"
  , "-Ydetach"
  , "-Ydoc"
  , "-Ygenerics"
  , "-Ylog-all"
  , "-Ymatch-algo:<Ymatch-algo>"
  , "-Yprofile-class <class>"
  , "-Yprofile-memory"
  , "-Yprofile:<phase>"
  , "-Yrepl-debug"
  , "-Yrich-exceptions"
  , "-Yself-in-annots"
  , "-Ysqueeze:<enabled>"
  , "-Ystruct-dispatch:<policy>"
  , "-Ysuppress-vt-typer-warnings"
  , "-Ywarn-all"
  )

  val skip = Set(
    "-bootclasspath <path>"
  , "-classpath <path>"
  , "-d <directory|jar>"
  , "-Dproperty=value"
  , "-extdirs <path>"
  , "-J<flag>"
  , "-javabootclasspath <path>"
  , "-javaextdirs <path>"
  , "-P:<plugin>:<opt>"
  , "-P:continuations:enable"
  , "-toolcp <path>"
  , "-Xcheck-null"
  , "-Xdivergence211"
  , "-Xgenerate-phase-graph <file>"
  , "-Xmacro-settings:<option>"
  , "-Xmain-class <path>"
  , "-Xmigration:<version>"
  , "-Xoldpatmat"
  , "-Xplug-types"
  , "-Xplugin-disable:<plugin>"
  , "-Xplugin-require:<plugin>"
  , "-Xplugin:<paths>"
  , "-Xpluginsdir <path>"
  , "-Xprint-icode[:phases]"
  , "-Xprint:<phases>"
  , "-Xreporter <classname>"
  , "-Xscript <object>"
  , "-Xshow-class <class>"
  , "-Xshow-object <object>"
  , "-Xsource-reader <classname>"
  , "-Xxml:<_,property,-property>"
  , "-Ybrowse:<phases>"
  , "-Ybuild-manager-debug"
  , "-Ybuilder-debug:<manager>"
  , "-Ycompletion-debug"
  , "-Ycompletion:<provider>"
  , "-YdisableFlatCpCaching"
  , "-Ydump-classes <dir>"
  , "-Yfundep-materialization"
  , "-Ygen-asmp <dir>"
  , "-Ygen-javap <dir>"
  , "-Yinvalidate <classpath-entry>"
  , "-Ylinearizer:<which>"
  , "-Ylog:<phases>"
  , "-Yno-self-type-checks"
  , "-Yno-squeeze"
  , "-Ynotnull"
  , "-Yopt-inline-heuristics:<strategy>"
  , "-Yopt-trace <package/Class.method>"
  , "-Yopt-warnings:<_,warning,-warning>"
  , "-Ypatmat-exhaust-depth <n>"
  , "-Ypmat-debug"
  , "-Ypmat-naive"
  , "-Ypresentation-any-thread"
  , "-Ypresentation-delay <n>"
  , "-Ypresentation-log <file>"
  , "-Ypresentation-replay <file>"
  , "-Ypresentation-strict"
  , "-Yrecursion <n>"
  , "-Yrepl-outdir <path>"
  , "-Yshow-member-pos <output style>"
  , "-Yshow:<phases>"
  , "-Yskip-inline-info-attribute"
  , "@<file>"
  )

  val optionGroups = (optionLines
    groupBy(_._1) filterNot { case (option, _) =>
      legacy(option) || skip(option)
    } filter { case (option, _) =>
      true
    } mapValues(_.map(_._2))
  )

  val mutableOptions = (optionGroups mapValues { values =>
    TreeMap.empty[ScalacVersion, (String, Option[String])] ++ values
  } toSeq) sortBy(_._1)

  val optionDescriptions = mutableOptions map { case (option, versions) =>
    val sb = new StringBuilder
    sb ++= "/* " ++= option ++= "\n * " ++= "=" * option.length += '\n'

    val first = versions.head._1

    def processVersions(
        toBeProcessed: List[ScalacVersion],
        currentDescription: Option[(String, Option[String])],
        currentFirstVersion: Option[ScalacVersion],
        currentLastVersion: Option[ScalacVersion]): Unit = {

      /** Output current state */
      def output(): Unit = {
        val first = currentFirstVersion.get
        val last = currentLastVersion.get
        val description = currentDescription match {
          case Some((desc, legacy)) => desc + legacy.map(" // previously " +).getOrElse("")
          case _ => "!! missing !!"
        }
        val version = if (first == last) first.toString else first + " - " + last
        sb ++= " * %%%ds: %%s\n".format(ScalacHelp.maxLength * 2 + 3).format(version, description)
        if (toBeProcessed.isEmpty) sb ++= " */\n"
      }

      if (toBeProcessed.isEmpty) {
        // Exit condition
        output()
      }
      else {
        val head :: tail = toBeProcessed
        val exists = versions get head
        val current = Some(head)

        exists match {
          // First encounter of an existing option description
          case e @ Some(description) if currentFirstVersion == None =>
            processVersions(tail, e, current, current)

          // Repeated existing description - aggregating versions
          case e @ Some(description) if e == currentDescription =>
            processVersions(tail, currentDescription, currentFirstVersion, Some(head))

          // Previous description has changed, output last description, start tracking new description
          case e @ Some(description) =>
            output()
            processVersions(tail, e, current, current)

          // There was no option present, but let's assume that it's not yet missing
          case None if head < first =>
            processVersions(tail, currentDescription, currentFirstVersion, currentLastVersion)

          // There was no option present, but since a description was here previously it must be missing now
          case None if currentDescription != None =>
            output()
            processVersions(tail, None, current, current)

          // The option is still missing, so aggregate missing versions
          case None =>
            processVersions(tail, currentDescription, currentFirstVersion, current)
        }
      }
    }

    processVersions(ScalacHelp.versions, None, None, None)
    sb.toString
  }

  val sb = new StringBuilder
  var too = 0
  optionDescriptions foreach { option =>
    val first = option.split("\n").head + "\n"
    allSources.find(_._2.contains(option)) match {
      case Some(_) =>
      case _ =>
        println("#" * 100)
        allSources.find(_._2.contains(first)) match {
          case Some((source, body)) =>
            println("Found in: " + source.path)
          case _ =>
            println("Not found!")
        }
        println(option)
        too += 1
        if (too > 2) sys.exit(0)
    }
  }
}
