
package views.html.Avaliador

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
object formularioEdicao extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[forms.AlterarUsuarioForm],Usuario,List[Campus],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[forms.AlterarUsuarioForm], avaliador: Usuario, campus: List[Campus]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.88*/("""


"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Edição do Avaliador: """),_display_(Seq[Any](/*13.51*/avaliador/*13.60*/.nome)),format.raw/*13.65*/("""</h1>
			</div>
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.form(action = routes.Avaliadores.editar(avaliador.id), 'style -> "margin:0;")/*16.89*/{_display_(Seq[Any](format.raw/*16.90*/("""
			
			<div class="clearfix" id="idCurso_field">
					<label for="idCampus">Escolha o Campus do Avaliador:</label>
					<div class="input">
						<select id="idCampus" name="idCampus" class="span5">
							"""),_display_(Seq[Any](/*22.9*/for(campi <- campus) yield /*22.29*/ {_display_(Seq[Any](format.raw/*22.31*/("""
							  <option value=""""),_display_(Seq[Any](/*23.26*/campi/*23.31*/.id)),format.raw/*23.34*/("""">"""),_display_(Seq[Any](/*23.37*/campi/*23.42*/.nome)),format.raw/*23.47*/("""</option>
							""")))})),format.raw/*24.9*/("""						
						</select>
						<span class="help-inline"></span>
						<span class="help-block"></span>
					</div>
				</div>
			
	    		"""),_display_(Seq[Any](/*31.9*/helper/*31.15*/.inputText(formulario("nome"), 'id -> "nome", 'class -> "span5", '_label -> "Nome: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*31.150*/("""
		    	"""),_display_(Seq[Any](/*32.9*/helper/*32.15*/.inputText(formulario("email"), 'id -> "email", 'class -> "span5",  '_label -> "Email: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*32.154*/("""
		    	
				<button type="submit" class="btn btn-primary">Editar Avaliador</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*36.27*/routes/*36.33*/.Avaliadores.listaAvaliadores)),format.raw/*36.62*/("""" >Cancelar</a>
			""")))})),format.raw/*37.5*/("""
			
		</div>
	</div>	


""")))})))}
    }
    
    def render(formulario:Form[forms.AlterarUsuarioForm],avaliador:Usuario,campus:List[Campus]) = apply(formulario,avaliador,campus)
    
    def f:((Form[forms.AlterarUsuarioForm],Usuario,List[Campus]) => play.api.templates.Html) = (formulario,avaliador,campus) => apply(formulario,avaliador,campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Avaliador/formularioEdicao.scala.html
                    HASH: d5bb64a8dafea8a50f5977367d4f2df8ef9bb390
                    MATRIX: 821->1|1071->87|1103->181|1140->184|1151->188|1189->190|1377->342|1395->351|1422->356|1484->383|1499->389|1586->467|1625->468|1874->682|1910->702|1950->704|2013->731|2027->736|2052->739|2091->742|2105->747|2132->752|2182->771|2361->915|2376->921|2534->1056|2579->1066|2594->1072|2756->1211|2918->1337|2933->1343|2984->1372|3036->1393
                    LINES: 27->1|35->1|38->7|39->8|39->8|39->8|44->13|44->13|44->13|47->16|47->16|47->16|47->16|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|62->31|62->31|62->31|63->32|63->32|63->32|67->36|67->36|67->36|68->37
                    -- GENERATED --
                */
            