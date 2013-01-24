
package views.html.Editais

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
object visualizar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Edital,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(edital: Edital):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">
					"""),_display_(Seq[Any](/*14.7*/edital/*14.13*/.titulo)),format.raw/*14.20*/(""" <br/>
					<small>
						Cadastrado por: """),_display_(Seq[Any](/*16.24*/edital/*16.30*/.autor.getNome)),format.raw/*16.44*/("""
					</small>
				</h1>
				
				"""),_display_(Seq[Any](/*20.6*/if(isLogado())/*20.20*/ {_display_(Seq[Any](format.raw/*20.22*/("""
					"""),_display_(Seq[Any](/*21.7*/if(getUsuarioLogado().isProfessor)/*21.41*/ {_display_(Seq[Any](format.raw/*21.43*/("""
					<div style="float:right; position:relative; top:8px;">
						<a href=""""),_display_(Seq[Any](/*23.17*/routes/*23.23*/.Projetos.formulario)),format.raw/*23.43*/("""" class="btn"><i class="icon-plus"></i> Submeter um Novo Projeto </a>
					</div>
					""")))})),format.raw/*25.7*/("""
				""")))})),format.raw/*26.6*/("""
			</div>
			
			
	"""),_display_(Seq[Any](/*30.3*/if(isLogado())/*30.17*/ {_display_(Seq[Any](format.raw/*30.19*/("""
		"""),_display_(Seq[Any](/*31.4*/if(getUsuarioLogado().isAdministrador)/*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""
			
			
			"""),_display_(Seq[Any](/*34.5*/if(edital.projetos.size == 0)/*34.34*/ {_display_(Seq[Any](format.raw/*34.36*/("""
				<h3>Nenhum Projeto Cadastrado para este Edital.</h3>
			""")))}/*36.6*/else/*36.11*/{_display_(Seq[Any](format.raw/*36.12*/("""
				<div class="row">
				"""),_display_(Seq[Any](/*38.6*/for(projeto <- edital.projetos) yield /*38.37*/ {_display_(Seq[Any](format.raw/*38.39*/("""
						<div class="span5 well pull-left">
							<h2>
								<a href=""""),_display_(Seq[Any](/*41.19*/routes/*41.25*/.Projetos.visualizar(projeto.id))),format.raw/*41.57*/("""">
									"""),_display_(Seq[Any](/*42.11*/projeto/*42.18*/.titulo)),format.raw/*42.25*/("""
								</a>
							</h2>
							
							<div style="height:400px;">
								"""),_display_(Seq[Any](/*47.10*/Html(projeto.resumo))),format.raw/*47.30*/("""
							</div>
							
						"""),format.raw/*50.84*/("""
						
							
						
							"""),_display_(Seq[Any](/*54.9*/if(isProjetoAvaliado(projeto.id))/*54.42*/ {_display_(Seq[Any](format.raw/*54.44*/("""
								<span class="label label-success">Avaliado - """),_display_(Seq[Any](/*55.55*/getProjetoAvaliado(projeto.id)/*55.85*/.pontuacaoObtida)),format.raw/*55.101*/(""" Pontos Obtidos!</span>
							""")))}/*56.10*/else/*56.15*/{_display_(Seq[Any](format.raw/*56.16*/("""
								<span class="label label-important">Pendente!</span>
							""")))})),format.raw/*58.9*/("""
							
							
							
						</div>
				""")))})),format.raw/*63.6*/("""
				</div>
			""")))})),format.raw/*65.5*/("""
			
			
			
			
			""")))}/*70.6*/else/*70.10*/{_display_(Seq[Any](format.raw/*70.11*/("""
			   //Informa os dados do edital como a descricao do edital
			""")))})),format.raw/*72.5*/("""
		""")))})),format.raw/*73.4*/("""	
		
		
		</div>
	</div>	


""")))})))}
    }
    
    def render(edital:Edital) = apply(edital)
    
    def f:((Edital) => play.api.templates.Html) = (edital) => apply(edital)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Editais/visualizar.scala.html
                    HASH: 3c59af6fb7e941173e8fecd46fa137c38ba775d7
                    MATRIX: 768->1|948->17|978->109|1017->114|1028->118|1066->120|1239->258|1254->264|1283->271|1364->316|1379->322|1415->336|1489->375|1512->389|1552->391|1595->399|1638->433|1678->435|1793->514|1808->520|1850->540|1971->630|2009->637|2069->662|2092->676|2132->678|2172->683|2219->721|2259->723|2310->739|2348->768|2388->770|2470->835|2483->840|2522->841|2587->871|2634->902|2674->904|2785->979|2800->985|2854->1017|2904->1031|2920->1038|2949->1045|3069->1129|3111->1149|3171->1258|3241->1293|3283->1326|3323->1328|3415->1384|3454->1414|3493->1430|3545->1464|3558->1469|3597->1470|3700->1542|3779->1590|3828->1608|3872->1635|3885->1639|3924->1640|4024->1709|4060->1714
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|45->14|45->14|45->14|47->16|47->16|47->16|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|56->25|57->26|61->30|61->30|61->30|62->31|62->31|62->31|65->34|65->34|65->34|67->36|67->36|67->36|69->38|69->38|69->38|72->41|72->41|72->41|73->42|73->42|73->42|78->47|78->47|81->50|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|89->58|94->63|96->65|101->70|101->70|101->70|103->72|104->73
                    -- GENERATED --
                */
            