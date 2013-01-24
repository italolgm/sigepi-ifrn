
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
object formularioEdicao extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Projeto],List[Edital],List[Campus],Projeto,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Projeto], editais: List[Edital], campus: List[Campus], projeto: Projeto):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._

import helper._


Seq[Any](format.raw/*1.92*/("""
"""),format.raw/*5.1*/("""


"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Edição do Projeto: """),_display_(Seq[Any](/*13.29*/projeto/*13.36*/.titulo)),format.raw/*13.43*/("""</h1>
			</div>
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.form(action = routes.Projetos.editar(projeto.id), 'style -> "margin:0;")/*16.84*/{_display_(Seq[Any](format.raw/*16.85*/("""
				"""),_display_(Seq[Any](/*17.6*/helper/*17.12*/.inputText(formulario("titulo"), 'id -> "titulo", 'class -> "span8", '_label -> "Título do Projeto: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*17.164*/("""
				
				<div class="clearfix " id="idCurso_field">
					<label for="idEdital">Edital do Projeto:</label>
					<div class="input">
						<select id="idEdital" name="idEdital" class="span5">
							"""),_display_(Seq[Any](/*23.9*/for(edital <- editais) yield /*23.31*/ {_display_(Seq[Any](format.raw/*23.33*/("""
							  <option """),_display_(Seq[Any](/*24.19*/if(projeto.edital.id == edital.id)/*24.53*/{_display_(Seq[Any](format.raw/*24.54*/(""" selected="selected" """)))})),format.raw/*24.76*/(""" value=""""),_display_(Seq[Any](/*24.85*/edital/*24.91*/.id)),format.raw/*24.94*/("""">"""),_display_(Seq[Any](/*24.97*/edital/*24.103*/.titulo)),format.raw/*24.110*/("""</option>
							""")))})),format.raw/*25.9*/("""						
						</select>
						<span class="help-inline"></span>
						<span class="help-block"></span>
					</div>
				</div>
				
				<div class="clearfix" id="idCurso_field">
					<label for="idCampus">Escolha o Campus do Projeto:</label>
					<div class="input">
						<select id="idCampus" name="idCampus" class="span5">
							"""),_display_(Seq[Any](/*36.9*/for(campi <- campus) yield /*36.29*/ {_display_(Seq[Any](format.raw/*36.31*/("""
							  <option value=""""),_display_(Seq[Any](/*37.26*/campi/*37.31*/.id)),format.raw/*37.34*/("""">"""),_display_(Seq[Any](/*37.37*/campi/*37.42*/.nome)),format.raw/*37.47*/("""</option>
							""")))})),format.raw/*38.9*/("""						
						</select>
						<span class="help-inline"></span>
						<span class="help-block"></span>
					</div>
				</div>
				
				"""),_display_(Seq[Any](/*45.6*/helper/*45.12*/.textarea(formulario("resumo"), 'id -> "resumo", 'rows -> "15", 'class -> "span10", '_label -> "Resumo: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*45.168*/("""
				"""),_display_(Seq[Any](/*46.6*/helper/*46.12*/.textarea(formulario("introducao"), 'id -> "introducao", 'rows -> "15", 'class -> "span10", '_label -> "Introdução: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*46.180*/("""
				"""),_display_(Seq[Any](/*47.6*/helper/*47.12*/.textarea(formulario("fundamentacaoTeorica"), 'id -> "fundamentacaoTeorica", 'rows -> "15", 'class -> "span10", '_label -> "Fundamentação Teorica: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*47.211*/("""
				"""),_display_(Seq[Any](/*48.6*/helper/*48.12*/.textarea(formulario("justificativa"), 'id -> "justificativa", 'rows -> "10", 'class -> "span10", '_label -> "Justificativa: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*48.189*/("""
				"""),_display_(Seq[Any](/*49.6*/helper/*49.12*/.textarea(formulario("objetivos"), 'id -> "objetivos", 'rows -> "10", 'class -> "span10", '_label -> "Objetivos: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*49.177*/("""
				"""),_display_(Seq[Any](/*50.6*/helper/*50.12*/.textarea(formulario("metodologia"), 'id -> "metodologia", 'rows -> "10", 'class -> "span10", '_label -> "Metodologia: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*50.183*/("""
				"""),_display_(Seq[Any](/*51.6*/helper/*51.12*/.textarea(formulario("referencias"), 'id -> "referencias", 'rows -> "10", 'class -> "span10", '_label -> "Referencias:", '_showConstraints -> false, '_showErrors -> true))),format.raw/*51.182*/("""
				
				<button type="submit" class="btn btn-primary">Editar o Projeto</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*55.27*/routes/*55.33*/.Projetos.index)),format.raw/*55.48*/("""" >Cancelar</a>
			""")))})),format.raw/*56.5*/("""
			
		</div>
	</div>	


""")))})))}
    }
    
    def render(formulario:Form[Projeto],editais:List[Edital],campus:List[Campus],projeto:Projeto) = apply(formulario,editais,campus,projeto)
    
    def f:((Form[Projeto],List[Edital],List[Campus],Projeto) => play.api.templates.Html) = (formulario,editais,campus,projeto) => apply(formulario,editais,campus,projeto)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/formularioEdicao.scala.html
                    HASH: 366607d76ed2fc409866b59e57d2eb47769de14d
                    MATRIX: 816->1|1051->91|1079->162|1120->169|1131->173|1169->175|1310->280|1326->287|1355->294|1417->321|1432->327|1514->400|1553->401|1595->408|1610->414|1785->566|2025->771|2063->793|2103->795|2159->815|2202->849|2241->850|2295->872|2340->881|2355->887|2380->890|2419->893|2435->899|2465->906|2515->925|2893->1268|2929->1288|2969->1290|3032->1317|3046->1322|3071->1325|3110->1328|3124->1333|3151->1338|3201->1357|3378->1499|3393->1505|3572->1661|3614->1668|3629->1674|3820->1842|3862->1849|3877->1855|4099->2054|4141->2061|4156->2067|4356->2244|4398->2251|4413->2257|4601->2422|4643->2429|4658->2435|4852->2606|4894->2613|4909->2619|5102->2789|5261->2912|5276->2918|5313->2933|5365->2954
                    LINES: 27->1|35->1|36->5|39->8|39->8|39->8|44->13|44->13|44->13|47->16|47->16|47->16|47->16|48->17|48->17|48->17|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|86->55|86->55|86->55|87->56
                    -- GENERATED --
                */
            