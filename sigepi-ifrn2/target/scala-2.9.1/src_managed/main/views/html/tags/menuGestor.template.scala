
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
object menuGestor extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
			"""),format.raw/*10.83*/("""
			<div class="nav-collapse">
				<ul class="nav">
				 <li><a href=""""),_display_(Seq[Any](/*13.20*/routes/*13.26*/.Application.index)),format.raw/*13.44*/("""" style="font-size: 28px;">SIGEPI</a></li>
					<li><a href=""""),_display_(Seq[Any](/*14.20*/routes/*14.26*/.Gestores.index)),format.raw/*14.41*/("""">Home</a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Editais <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Editais.index)),format.raw/*18.43*/("""">Visualizar Editais</a></li> 
						"""),format.raw/*19.80*/("""
						</ul>
					</li>
					"""),format.raw/*30.8*/("""
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Projetos <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*34.23*/routes/*34.29*/.Projetos.index)),format.raw/*34.44*/(""""> Visualizar Projetos</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*35.23*/routes/*35.29*/.Projetos.meusProjetosAvaliados)),format.raw/*35.60*/(""""> Ver Projetos já avaliados</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*36.23*/routes/*36.29*/.Projetos.rankingProjetos)),format.raw/*36.54*/(""""> Ranking dos Projetos</a></li>
						</ul>
					</li>
					"""),format.raw/*57.8*/("""
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Usuários <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						"""),format.raw/*61.49*/("""
						"""),format.raw/*62.87*/("""
						"""),format.raw/*63.80*/("""
						"""),format.raw/*64.51*/("""
						"""),format.raw/*65.95*/("""
						"""),format.raw/*66.86*/("""
						 	<li class="nav-header">Avaliadores</li>
							<li><a href=""""),_display_(Seq[Any](/*68.22*/routes/*68.28*/.Avaliadores.listaAvaliadores)),format.raw/*68.57*/("""">Visualizar Avaliadores</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*69.23*/routes/*69.29*/.Avaliadores.formulario)),format.raw/*69.52*/("""">Cadastrar Avaliador</a></li>
						</ul>
					</li>
					
				</ul>
				<ul class="nav pull-right">
					<li class="dropdown">
		            	<a data-toggle="dropdown" class="dropdown-toggle" href="#">
		            		<strong>"""),_display_(Seq[Any](/*77.26*/getUsuarioLogado()/*77.44*/.nome)),format.raw/*77.49*/("""</strong> <span class="caret"></span>
		            	</a>
		             	<ul class="dropdown-menu" style="width:200px;">
			                <li class="nav-header"><i class="icon-user"></i> Minha Conta</li>
			              """),format.raw/*81.109*/("""
			                
			                <li class="divider"></li>
			                <li><a href=""""),_display_(Seq[Any](/*84.34*/routes/*84.40*/.Sessions.efetuarlogout)),format.raw/*84.63*/("""">Sair do sistema</a></li>
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
                    DATE: Sun Jan 06 21:35:25 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/tags/menuGestor.scala.html
                    HASH: 20b5859d9dbbe2719f3e28ba6e101b639f93c9b4
                    MATRIX: 882->56|1195->420|1305->494|1320->500|1360->518|1459->581|1474->587|1511->602|1769->824|1784->830|1820->844|1886->955|1945->1372|2189->1580|2204->1586|2241->1601|2332->1656|2347->1662|2400->1693|2497->1754|2512->1760|2559->1785|2650->2833|2870->3067|2906->3155|2942->3236|2978->3288|3014->3384|3050->3471|3158->3543|3173->3549|3224->3578|3317->3635|3332->3641|3377->3664|3650->3901|3677->3919|3704->3924|3961->4243|4099->4345|4114->4351|4159->4374
                    LINES: 31->3|38->10|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|47->19|50->30|54->34|54->34|54->34|55->35|55->35|55->35|56->36|56->36|56->36|59->57|63->61|64->62|65->63|66->64|67->65|68->66|70->68|70->68|70->68|71->69|71->69|71->69|79->77|79->77|79->77|83->81|86->84|86->84|86->84
                    -- GENERATED --
                */
            