
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Edital],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(editais: List[Edital]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""


<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Editais</h1>
				
				"""),_display_(Seq[Any](/*16.6*/if(isLogado())/*16.20*/ {_display_(Seq[Any](format.raw/*16.22*/("""
					"""),_display_(Seq[Any](/*17.7*/if(getUsuarioLogado().isAdministrador)/*17.45*/ {_display_(Seq[Any](format.raw/*17.47*/("""
					<div style="float:right; position:relative; top:8px;">
						<a href=""""),_display_(Seq[Any](/*19.17*/routes/*19.23*/.Editais.formulario)),format.raw/*19.42*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Edital</a>
					</div>
					""")))})),format.raw/*21.7*/("""
				""")))})),format.raw/*22.6*/("""
			</div>
			
			"""),_display_(Seq[Any](/*25.5*/if(editais.size == 0)/*25.26*/ {_display_(Seq[Any](format.raw/*25.28*/("""
				<h3>Nenhum edital cadastrado.</h3>			
			""")))}/*27.6*/else/*27.11*/{_display_(Seq[Any](format.raw/*27.12*/("""
				"""),_display_(Seq[Any](/*28.6*/for(edital <- editais) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
				<div class="item-lista">
					<div class="item-lista">
						<div class="item">
							<h2>
								<a href=""""),_display_(Seq[Any](/*33.19*/routes/*33.25*/.Editais.visualizar(edital.id))),format.raw/*33.55*/("""">
									"""),_display_(Seq[Any](/*34.11*/edital/*34.17*/.titulo)),format.raw/*34.24*/("""
									
									"""),_display_(Seq[Any](/*36.11*/if(isLogado())/*36.25*/ {_display_(Seq[Any](format.raw/*36.27*/("""
								        """),_display_(Seq[Any](/*37.18*/if(getUsuarioLogado().isAdministrador)/*37.56*/ {_display_(Seq[Any](format.raw/*37.58*/("""
									<small>
										- 
											"""),_display_(Seq[Any](/*40.13*/if(edital.projetos.size == 0)/*40.42*/ {_display_(Seq[Any](format.raw/*40.44*/("""
												Nenhum Projeto Cadastrado.
											""")))}/*42.14*/else/*42.19*/{_display_(Seq[Any](format.raw/*42.20*/("""
												"""),_display_(Seq[Any](/*43.14*/edital/*43.20*/.projetos.size)),format.raw/*43.34*/(""" Projetos(s) Cadastrado(s).
											""")))})),format.raw/*44.13*/("""
									</small>
									    """)))})),format.raw/*46.15*/("""
									    
									""")))})),format.raw/*48.11*/("""   							
									
								</a>
								
							</h2>
							<div style="font-size:12px;">
								Cadastrado em: <strong>"""),_display_(Seq[Any](/*54.33*/edital/*54.39*/.getDataCadastro)),format.raw/*54.55*/("""</strong> / Autor: <strong>"""),_display_(Seq[Any](/*54.83*/edital/*54.89*/.autor.getNome)),format.raw/*54.103*/("""</strong>
							</div>						
						</div>
						
						
								
						<div style="float:right; padding-top:15px;">
						
						"""),_display_(Seq[Any](/*62.8*/if(isLogado())/*62.22*/ {_display_(Seq[Any](format.raw/*62.24*/("""
								"""),_display_(Seq[Any](/*63.10*/if(getUsuarioLogado().isAdministrador)/*63.48*/ {_display_(Seq[Any](format.raw/*63.50*/("""
						
							<a href=""""),_display_(Seq[Any](/*65.18*/routes/*65.24*/.Editais.visualizar(edital.id))),format.raw/*65.54*/("""" class="btn btn-primary"><i class="icon-white icon-list-alt"></i> Visualizar os Projetos do Edital</a>
							
							
									<a href=""""),_display_(Seq[Any](/*68.20*/routes/*68.26*/.Editais.editar(edital.id))),format.raw/*68.52*/("""" class="btn"><i class="icon-edit"></i> Editar</a>
									<a href=""""),_display_(Seq[Any](/*69.20*/routes/*69.26*/.Editais.deletar(edital.id))),format.raw/*69.53*/("""" onclick="return confirm('Deseja realmente excluir o edital &quot;"""),_display_(Seq[Any](/*69.121*/edital/*69.127*/.titulo)),format.raw/*69.134*/("""&quot;?')" class="btn"><i class="icon-remove"></i> Excluir</a>
								""")))})),format.raw/*70.10*/("""
							""")))})),format.raw/*71.9*/("""
						</div>
					</div>
				</div>
				""")))})),format.raw/*75.6*/("""
			""")))})),format.raw/*76.5*/("""
		</div>
	</div>	


""")))})))}
    }
    
    def render(editais:List[Edital]) = apply(editais)
    
    def f:((List[Edital]) => play.api.templates.Html) = (editais) => apply(editais)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Editais/index.scala.html
                    HASH: aa5e98c780acffa07344b4454374cf1d720e2534
                    MATRIX: 769->1|956->24|986->116|1025->121|1036->125|1074->127|1279->297|1302->311|1342->313|1385->321|1432->359|1472->361|1587->440|1602->446|1643->465|1760->551|1798->558|1855->580|1885->601|1925->603|1992->653|2005->658|2044->659|2086->666|2124->688|2164->690|2320->810|2335->816|2387->846|2437->860|2452->866|2481->873|2540->896|2563->910|2603->912|2658->931|2705->969|2745->971|2827->1017|2865->1046|2905->1048|2978->1103|2991->1108|3030->1109|3081->1124|3096->1130|3132->1144|3205->1185|3272->1220|3331->1247|3498->1378|3513->1384|3551->1400|3615->1428|3630->1434|3667->1448|3841->1587|3864->1601|3904->1603|3951->1614|3998->1652|4038->1654|4101->1681|4116->1687|4168->1717|4346->1859|4361->1865|4409->1891|4516->1962|4531->1968|4580->1995|4685->2063|4701->2069|4731->2076|4836->2149|4877->2159|4954->2205|4991->2211
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|52->21|53->22|56->25|56->25|56->25|58->27|58->27|58->27|59->28|59->28|59->28|64->33|64->33|64->33|65->34|65->34|65->34|67->36|67->36|67->36|68->37|68->37|68->37|71->40|71->40|71->40|73->42|73->42|73->42|74->43|74->43|74->43|75->44|77->46|79->48|85->54|85->54|85->54|85->54|85->54|85->54|93->62|93->62|93->62|94->63|94->63|94->63|96->65|96->65|96->65|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|101->70|102->71|106->75|107->76
                    -- GENERATED --
                */
            