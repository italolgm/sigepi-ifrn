
package views.html.Gestor

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
    def apply/*1.2*/(formulario: Form[forms.AlterarUsuarioForm], gestor: Usuario, campus: List[Campus]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.85*/("""


"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Edição do Gestor: """),_display_(Seq[Any](/*13.48*/gestor/*13.54*/.nome)),format.raw/*13.59*/("""</h1>
			</div>
			
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.form(action = routes.Gestores.editar(gestor.id), 'style -> "margin:0;")/*16.83*/{_display_(Seq[Any](format.raw/*16.84*/("""
			
			<div class="clearfix" id="idCurso_field">
					<label for="idCampus">Escolha o Campus do Gestor:</label>
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
		    	
				<button type="submit" class="btn btn-primary">Editar Gestor</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*36.27*/routes/*36.33*/.Gestores.listaGestores)),format.raw/*36.56*/("""" >Cancelar</a>
			""")))})),format.raw/*37.5*/("""
			
		</div>
	</div>	


""")))})))}
    }
    
    def render(formulario:Form[forms.AlterarUsuarioForm],gestor:Usuario,campus:List[Campus]) = apply(formulario,gestor,campus)
    
    def f:((Form[forms.AlterarUsuarioForm],Usuario,List[Campus]) => play.api.templates.Html) = (formulario,gestor,campus) => apply(formulario,gestor,campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Gestor/formularioEdicao.scala.html
                    HASH: 67457c9d233154337b0a46c31ad66299960a6ab9
                    MATRIX: 818->1|1065->84|1097->178|1134->181|1145->185|1183->187|1368->336|1383->342|1410->347|1472->374|1487->380|1568->452|1607->453|1853->664|1889->684|1929->686|1992->713|2006->718|2031->721|2070->724|2084->729|2111->734|2161->753|2340->897|2355->903|2513->1038|2558->1048|2573->1054|2735->1193|2894->1316|2909->1322|2954->1345|3006->1366
                    LINES: 27->1|35->1|38->7|39->8|39->8|39->8|44->13|44->13|44->13|47->16|47->16|47->16|47->16|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|62->31|62->31|62->31|63->32|63->32|63->32|67->36|67->36|67->36|68->37
                    -- GENERATED --
                */
            