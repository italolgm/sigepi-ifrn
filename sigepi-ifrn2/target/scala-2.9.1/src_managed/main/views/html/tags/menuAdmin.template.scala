
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
object menuAdmin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
			"""),format.raw/*10.88*/("""
			<div class="nav-collapse">
				<ul class="nav">
				 <li><a href=""""),_display_(Seq[Any](/*13.20*/routes/*13.26*/.Application.index)),format.raw/*13.44*/("""" style="font-size: 28px;">SIGEPI</a></li>
					<li><a href=""""),_display_(Seq[Any](/*14.20*/routes/*14.26*/.Administracao.index)),format.raw/*14.46*/("""">Home</a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Editais <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Editais.index)),format.raw/*18.43*/("""">Visualizar Editais</a></li> 
						 	<li><a href=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Editais.formulario)),format.raw/*19.48*/("""">Cadastrar Edital</a></li> 
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Campus <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.CampusController.index)),format.raw/*25.52*/(""""> Visualizar Campus</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.CampusController.formulario)),format.raw/*26.57*/("""">Cadastrar Campus</a></li>
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Projetos <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 	<li><a href=""""),_display_(Seq[Any](/*32.23*/routes/*32.29*/.Projetos.index)),format.raw/*32.44*/(""""> Visualizar Projetos</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*33.23*/routes/*33.29*/.Projetos.meusProjetosAvaliados)),format.raw/*33.60*/(""""> Ver Projetos já avaliados</a></li>
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Grupos de Pesquisa <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 """),format.raw/*39.89*/("""
						 """),format.raw/*40.93*/("""
							<li class="nav-header">Categorias</li>
						 """),format.raw/*42.91*/("""
						 """),format.raw/*43.94*/("""
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Area de Conhecimento <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
						 """),format.raw/*49.94*/("""
						 """),format.raw/*50.96*/("""
						</ul>
					</li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Usuários <b class="caret"></b></a>
						<ul class="dropdown-menu" style="width: 180px;">
							<li class="nav-header">Gestores</li>
						 	<li><a href=""""),_display_(Seq[Any](/*57.23*/routes/*57.29*/.Gestores.listaGestores)),format.raw/*57.52*/("""">Visualizar Gestores</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*58.23*/routes/*58.29*/.Gestores.formulario)),format.raw/*58.49*/("""">Cadastrar Gestor</a></li>
							<li class="nav-header">Professores</li>
						 	<li><a href=""""),_display_(Seq[Any](/*60.23*/routes/*60.29*/.Professores.listaProfessores)),format.raw/*60.58*/("""">Visualizar Professores</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*61.23*/routes/*61.29*/.Professores.formulario)),format.raw/*61.52*/("""">Cadastrar Professor</a></li>
						 	<li class="nav-header">Avaliadores</li>
							<li><a href=""""),_display_(Seq[Any](/*63.22*/routes/*63.28*/.Avaliadores.listaAvaliadores)),format.raw/*63.57*/("""">Visualizar Avaliadores</a></li>
						 	<li><a href=""""),_display_(Seq[Any](/*64.23*/routes/*64.29*/.Avaliadores.formulario)),format.raw/*64.52*/("""">Cadastrar Avaliador</a></li>
						</ul>
					</li>
				</ul>
				<ul class="nav pull-right">
					<li class="dropdown">
		            	<a data-toggle="dropdown" class="dropdown-toggle" href="#">
		            		<strong>"""),_display_(Seq[Any](/*71.26*/getUsuarioLogado()/*71.44*/.nome)),format.raw/*71.49*/("""</strong> <span class="caret"></span>
		            	</a>
		             	<ul class="dropdown-menu" style="width:200px;">
			                <li class="nav-header"><i class="icon-user"></i> Minha Conta</li>
			              """),format.raw/*75.109*/("""
			                
			                <li class="divider"></li>
			                <li><a href=""""),_display_(Seq[Any](/*78.34*/routes/*78.40*/.Sessions.efetuarlogout)),format.raw/*78.63*/("""">Sair do sistema</a></li>
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
                    DATE: Sun Jan 06 20:30:51 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/tags/menuAdmin.scala.html
                    HASH: 683e1417b07bb02b3f63c56ce9e523dbd54ca00f
                    MATRIX: 881->56|1194->425|1304->499|1319->505|1359->523|1458->586|1473->592|1515->612|1773->834|1788->840|1824->854|1914->908|1929->914|1970->933|2265->1192|2280->1198|2325->1221|2414->1274|2429->1280|2479->1308|2775->1568|2790->1574|2827->1589|2918->1644|2933->1650|2986->1681|3279->2027|3316->2121|3400->2260|3437->2355|3695->2671|3732->2768|4046->3046|4061->3052|4106->3075|4196->3129|4211->3135|4253->3155|4388->3254|4403->3260|4454->3289|4547->3346|4562->3352|4607->3375|4745->3477|4760->3483|4811->3512|4904->3569|4919->3575|4964->3598|5230->3828|5257->3846|5284->3851|5541->4170|5679->4272|5694->4278|5739->4301
                    LINES: 31->3|38->10|41->13|41->13|41->13|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|53->25|53->25|53->25|54->26|54->26|54->26|60->32|60->32|60->32|61->33|61->33|61->33|67->39|68->40|70->42|71->43|77->49|78->50|85->57|85->57|85->57|86->58|86->58|86->58|88->60|88->60|88->60|89->61|89->61|89->61|91->63|91->63|91->63|92->64|92->64|92->64|99->71|99->71|99->71|103->75|106->78|106->78|106->78
                    -- GENERATED --
                */
            