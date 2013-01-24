
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
object formulario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Projeto],List[Edital],List[Campus],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Projeto], editais: List[Edital], campus: List[Campus]):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._

import helper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/(""" 

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Submissão de Projeto</h1>
			</div>
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.form(action = routes.Projetos.submeter(), 'style -> "margin:0;")/*16.76*/{_display_(Seq[Any](format.raw/*16.77*/("""
				"""),_display_(Seq[Any](/*17.6*/helper/*17.12*/.inputText(formulario("titulo"), 'id -> "titulo", 'class -> "span8", '_label -> "Título do Projeto: ", '_showConstraints -> false, '_showErros -> true))),format.raw/*17.163*/("""
				
				<div class="clearfix" id="idCampus_field">
					<label for="idEdital">Edital do Projeto:</label>
					<div class="input">
						<select id="idEdital" name="idEdital" class="span5">
							"""),_display_(Seq[Any](/*23.9*/for(edital <- editais) yield /*23.31*/ {_display_(Seq[Any](format.raw/*23.33*/("""
							  <option value=""""),_display_(Seq[Any](/*24.26*/edital/*24.32*/.id)),format.raw/*24.35*/("""">"""),_display_(Seq[Any](/*24.38*/edital/*24.44*/.titulo)),format.raw/*24.51*/("""</option>
							""")))})),format.raw/*25.9*/("""						
						</select>
						<span class="help-inline"></span>
						<span class="help-block"></span>
					</div>
				</div>
				
				<div class="clearfix" id="idCampus_field">
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
				
				<button type="submit" class="btn btn-primary">Submeter Projeto</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*55.27*/routes/*55.33*/.Projetos.meusProjetos)),format.raw/*55.55*/("""" >Cancelar</a>
			""")))})),format.raw/*56.5*/("""
			
		</div>
	</div>

""")))})),format.raw/*61.2*/("""



"""))}
    }
    
    def render(formulario:Form[Projeto],editais:List[Edital],campus:List[Campus]) = apply(formulario,editais,campus)
    
    def f:((Form[Projeto],List[Edital],List[Campus]) => play.api.templates.Html) = (formulario,editais,campus) => apply(formulario,editais,campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 10 22:19:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/formulario.scala.html
                    HASH: 551669221aa4be9a66046c723ab74c3f07d004d4
                    MATRIX: 802->1|1054->73|1082->91|1110->181|1147->184|1158->188|1196->190|1364->323|1379->329|1453->394|1492->395|1534->402|1549->408|1723->559|1963->764|2001->786|2041->788|2104->815|2119->821|2144->824|2183->827|2198->833|2227->840|2277->859|2656->1203|2692->1223|2732->1225|2795->1252|2809->1257|2834->1260|2873->1263|2887->1268|2914->1273|2964->1292|3141->1434|3156->1440|3335->1596|3377->1603|3392->1609|3583->1777|3625->1784|3640->1790|3862->1989|3904->1996|3919->2002|4119->2179|4161->2186|4176->2192|4364->2357|4406->2364|4421->2370|4615->2541|4657->2548|4672->2554|4865->2724|5024->2847|5039->2853|5083->2875|5135->2896|5195->2925
                    LINES: 27->1|37->1|38->3|39->7|40->8|40->8|40->8|48->16|48->16|48->16|48->16|49->17|49->17|49->17|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|57->25|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|70->38|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|87->55|87->55|87->55|88->56|93->61
                    -- GENERATED --
                */
            