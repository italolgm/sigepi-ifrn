
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
object visualizar4 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Projeto],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projetos: List[Projeto]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.27*/("""


"""),format.raw/*7.1*/("""

"""),_display_(Seq[Any](/*9.2*/main/*9.6*/  {_display_(Seq[Any](format.raw/*9.9*/("""
	<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;"> Meus Projetos Submetidos </h1>
				
							
				"""),_display_(Seq[Any](/*16.6*/if(isLogado())/*16.20*/ {_display_(Seq[Any](format.raw/*16.22*/("""
					"""),_display_(Seq[Any](/*17.7*/if(getUsuarioLogado().isProfessor)/*17.41*/ {_display_(Seq[Any](format.raw/*17.43*/("""
					<div style="float:right; position:relative; top:8px;">
						<a href=""""),_display_(Seq[Any](/*19.17*/routes/*19.23*/.Projetos.formulario)),format.raw/*19.43*/("""" class="btn"><i class="icon-plus"></i> Submeter Novo Projeto</a>
					</div>
					""")))})),format.raw/*21.7*/("""
				""")))})),format.raw/*22.6*/("""	
				
			</div>
			
			"""),_display_(Seq[Any](/*26.5*/if(projetos.size == 0)/*26.27*/ {_display_(Seq[Any](format.raw/*26.29*/("""
				<h3>Nenhum projeto foi submetido.</h3>			
			""")))}/*28.6*/else/*28.11*/{_display_(Seq[Any](format.raw/*28.12*/("""
			
			<table class="table table-bordered table-hover">
              <thead>
                <tr>
                  
                  <th>Edital</th>
                  <th>Projeto</th>
                  <th>Pontuacao Obtida</th>
                  <th>Situacao</th>
                </tr>
              </thead>
              <tbody>
              """),_display_(Seq[Any](/*41.16*/getUsuarioLogado()/*41.34*/.nome)),format.raw/*41.39*/("""
              
               	"""),_display_(Seq[Any](/*43.18*/for(projeto  <- projetos) yield /*43.43*/ {_display_(Seq[Any](format.raw/*43.45*/("""
                <tr>
               		<td style="width:30%;">
               			"""),_display_(Seq[Any](/*46.20*/projeto/*46.27*/.getEdital.getTitulo)),format.raw/*46.47*/("""
               		</td>
               		<td>
               		   """),_display_(Seq[Any](/*49.22*/projeto/*49.29*/.getTitulo)),format.raw/*49.39*/("""
               		</td>
               	    <td>
               	       """),_display_(Seq[Any](/*52.25*/getPontuacaoProjeto(projeto.id))),format.raw/*52.56*/("""
               	    </td>
               	    <td> 
               	    
               	    </td>
                </tr>
				""")))})),format.raw/*58.6*/("""
				
              </tbody>
            </table>
           """)))})),format.raw/*62.13*/("""
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
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/visualizar4.scala.html
                    HASH: a7702212995e477aea1e41384b95464916e195c4
                    MATRIX: 777->1|966->26|998->120|1037->125|1048->129|1087->132|1304->314|1327->328|1367->330|1410->338|1453->372|1493->374|1608->453|1623->459|1665->479|1782->565|1820->572|1884->601|1915->623|1955->625|2026->679|2039->684|2078->685|2477->1048|2504->1066|2531->1071|2602->1106|2643->1131|2683->1133|2804->1218|2820->1225|2862->1245|2968->1315|2984->1322|3016->1332|3128->1408|3181->1439|3345->1572|3443->1638
                    LINES: 27->1|35->1|38->7|40->9|40->9|40->9|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|52->21|53->22|57->26|57->26|57->26|59->28|59->28|59->28|72->41|72->41|72->41|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|83->52|83->52|89->58|93->62
                    -- GENERATED --
                */
            