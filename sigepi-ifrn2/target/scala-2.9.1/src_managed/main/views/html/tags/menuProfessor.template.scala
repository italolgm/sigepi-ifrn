
package views.html.tags

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object menuProfessor extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*3.1*/("""
<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			"""),format.raw/*10.86*/("""
			<div class="nav-collapse">
				<ul class="nav">
				 <li><a href=""""),_display_(Seq[Any](/*13.20*/routes/*13.26*/.Application.index)),format.raw/*13.44*/("""" style="font-size: 28px;">SIGEPI</a></li>
					<li><a href=""""),_display_(Seq[Any](/*14.20*/routes/*14.26*/.Professores.index)),format.raw/*14.44*/("""">Home</a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Editais <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						<li><a href=""""),_display_(Seq[Any](/*18.21*/routes/*18.27*/.Editais.index)),format.raw/*18.41*/("""">Visualizar Editais</a></li> 
						 """),format.raw/*19.78*/("""
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Projetos <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Projetos.meusProjetos)),format.raw/*25.51*/("""">Visualizar Meus Projetos</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Projetos.formulario)),format.raw/*26.49*/("""">Submeter Projeto</a></li>
						</ul>
					</li>
					"""),format.raw/*60.8*/("""
				</ul>
				<ul class="nav pull-right">
					<li class="dropdown">
		            	<a data-toggle="dropdown" class="dropdown-toggle" href="#">
		            		<strong>"""),_display_(Seq[Any](/*65.26*/getUsuarioLogado()/*65.44*/.nome)),format.raw/*65.49*/("""</strong> <span class="caret"></span>
		            	</a>
		             	<ul class="dropdown-menu" style="width:200px;">
			                <li class="nav-header"><i class="icon-user"></i> Minha Conta</li>
			              """),format.raw/*69.109*/("""
			                
			                <li class="divider"></li>
			                <li><a href=""""),_display_(Seq[Any](/*72.34*/routes/*72.40*/.Sessions.efetuarlogout)),format.raw/*72.63*/("""">Sair do sistema</a></li>
		              	</ul>
		          	</li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 19:38:22 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/tags/menuProfessor.scala.html
                    HASH: a5ef6a08bff4deef1400f4a1091c7be6e144e7b1
                    MATRIX: 885->56|1198->423|1308->497|1323->503|1363->521|1462->584|1477->590|1517->608|1773->828|1788->834|1824->848|1891->957|2160->1190|2175->1196|2219->1218|2314->1277|2329->1283|2371->1303|2457->2977|2668->3152|2695->3170|2722->3175|2979->3494|3117->3596|3132->3602|3177->3625
                    LINES: 31->3|38->10|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|47->19|53->25|53->25|53->25|54->26|54->26|54->26|57->60|62->65|62->65|62->65|66->69|69->72|69->72|69->72
                    -- GENERATED --
                */
            