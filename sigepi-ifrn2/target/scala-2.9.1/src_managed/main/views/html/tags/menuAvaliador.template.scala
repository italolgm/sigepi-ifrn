
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
object menuAvaliador extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
					<li><a href=""""),_display_(Seq[Any](/*14.20*/routes/*14.26*/.Avaliadores.index)),format.raw/*14.44*/("""">Home</a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Editais <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Editais.index)),format.raw/*18.43*/("""">Visualizar Editais</a></li> 
						 """),format.raw/*19.78*/("""
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Projetos <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
							<li><a href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Projetos.index)),format.raw/*25.43*/(""""> Visualizar Projetos</a></li>
							<li><a href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.Projetos.meusProjetosAvaliados)),format.raw/*26.59*/(""""> Ver Projetos já avaliados</a></li>
						</ul>
					</li>
					
				"""),format.raw/*59.7*/("""	
				</ul>
				<ul class="nav pull-right">
					<li class="dropdown">
		            	<a data-toggle="dropdown" class="dropdown-toggle" href="#">
		            		<strong>"""),_display_(Seq[Any](/*64.26*/getUsuarioLogado()/*64.44*/.nome)),format.raw/*64.49*/("""</strong> <span class="caret"></span>
		            	</a>
		             	<ul class="dropdown-menu" style="width:200px;">
			                <li class="nav-header"><i class="icon-user"></i> Minha Conta</li>
			              """),format.raw/*68.109*/("""
			                
			                <li class="divider"></li>
			                <li><a href=""""),_display_(Seq[Any](/*71.34*/routes/*71.40*/.Sessions.efetuarlogout)),format.raw/*71.63*/("""">Sair do sistema</a></li>
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
                    DATE: Sun Jan 06 21:35:18 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/tags/menuAvaliador.scala.html
                    HASH: ca02d8b7c90e0db51538692cd04b3d1edf085b28
                    MATRIX: 885->56|1198->423|1308->497|1323->503|1363->521|1462->584|1477->590|1517->608|1775->830|1790->836|1826->850|1893->959|2161->1191|2176->1197|2213->1212|2303->1266|2318->1272|2371->1303|2473->2983|2685->3159|2712->3177|2739->3182|2996->3501|3134->3603|3149->3609|3194->3632
                    LINES: 31->3|38->10|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|47->19|53->25|53->25|53->25|54->26|54->26|54->26|58->59|63->64|63->64|63->64|67->68|70->71|70->71|70->71
                    -- GENERATED --
                */
            