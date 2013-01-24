
package views.html.Projetos

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Projeto],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projetos: List[Projeto]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Projetos</h1> 
				
				<div style="float:right; position:relative; top:8px;">
					<h4>
					   
					  """),_display_(Seq[Any](/*18.9*/projetos/*18.17*/.size)),format.raw/*18.22*/(""" Projetos(s) Submetido(s).
					  
					</h4>
				</div>
			</div>
			
			"""),_display_(Seq[Any](/*24.5*/if(projetos.size == 0)/*24.27*/ {_display_(Seq[Any](format.raw/*24.29*/("""
				<h3>Nenhum projeto submetido.</h3>			
			""")))}/*26.6*/else/*26.11*/{_display_(Seq[Any](format.raw/*26.12*/("""
				"""),_display_(Seq[Any](/*27.6*/for(projeto <- projetos) yield /*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""
				<div class="item-lista">
					<div class="item-lista">
						<div class="item">
							<h2>
								<a href=""""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Projetos.visualizar(projeto.id))),format.raw/*32.57*/("""">
									"""),_display_(Seq[Any](/*33.11*/projeto/*33.18*/.titulo)),format.raw/*33.25*/("""
									<small>
									- """),_display_(Seq[Any](/*35.13*/projeto/*35.20*/.edital.getTitulo)),format.raw/*35.37*/("""
									</small>
								</a>
							</h2>
							
				               		
							
							<div style="font-size:12px;">
								"""),format.raw/*43.85*/("""
								Autor: <strong>"""),_display_(Seq[Any](/*44.25*/projeto/*44.32*/.autor.getNome)),format.raw/*44.46*/("""</strong>
							</div>						
						</div>
						
						"""),format.raw/*59.9*/("""
					</div>
				</div>
				""")))})),format.raw/*62.6*/("""
			""")))})),format.raw/*63.5*/("""
		</div>
	</div>	

""")))})))}
    }
    
    def render(projetos:List[Projeto]) = apply(projetos)
    
    def f:((List[Projeto]) => play.api.templates.Html) = (projetos) => apply(projetos)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/index.scala.html
                    HASH: b78b41f5cda7eb96ea4e371e0e9b848195835981
                    MATRIX: 771->1|960->26|990->118|1029->123|1040->127|1078->129|1367->383|1384->391|1411->396|1527->477|1558->499|1598->501|1665->551|1678->556|1717->557|1759->564|1799->588|1839->590|1995->710|2010->716|2064->748|2114->762|2130->769|2159->776|2227->808|2243->815|2282->832|2446->1044|2508->1070|2524->1077|2560->1091|2647->1804|2710->1836|2747->1842
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|49->18|49->18|49->18|55->24|55->24|55->24|57->26|57->26|57->26|58->27|58->27|58->27|63->32|63->32|63->32|64->33|64->33|64->33|66->35|66->35|66->35|74->43|75->44|75->44|75->44|79->59|82->62|83->63
                    -- GENERATED --
                */
            