
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
object formulario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Usuario],List[Campus],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Usuario], campus: List[Campus]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.51*/("""


"""),format.raw/*7.1*/("""

"""),_display_(Seq[Any](/*9.2*/main/*9.6*/ {_display_(Seq[Any](format.raw/*9.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Cadastro de Avaliador</h1>
			</div>
			
			"""),_display_(Seq[Any](/*17.5*/helper/*17.11*/.form(action = routes.Avaliadores.cadastrar(), 'style -> "margin:0;")/*17.80*/{_display_(Seq[Any](format.raw/*17.81*/("""
	    		"""),_display_(Seq[Any](/*18.9*/helper/*18.15*/.inputText(formulario("nome"), 'id -> "nome", 'class -> "span5", '_label -> "Nome: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*18.150*/("""
		    	"""),_display_(Seq[Any](/*19.9*/helper/*19.15*/.inputText(formulario("email"), 'id -> "email", 'class -> "span5",  '_label -> "Email: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*19.154*/("""
		    	
		    	<div class="clearfix" id="idCurso_field">
					<label for="idCampus">Escolha o Campus:</label>
					<div class="input">
						<select id="idCampus" name="idCampus" class="span5">
							"""),_display_(Seq[Any](/*25.9*/for(campi <- campus) yield /*25.29*/ {_display_(Seq[Any](format.raw/*25.31*/("""
							  <option value=""""),_display_(Seq[Any](/*26.26*/campi/*26.31*/.id)),format.raw/*26.34*/("""">"""),_display_(Seq[Any](/*26.37*/campi/*26.42*/.nome)),format.raw/*26.47*/("""</option>
							""")))})),format.raw/*27.9*/("""						
						</select>
						<span class="help-inline"></span>
						<span class="help-block"></span>
					</div>
				</div>
				
		    	"""),_display_(Seq[Any](/*34.9*/helper/*34.15*/.inputText(formulario("login"), 'id -> "login", 'class -> "span5",  '_label -> "Login: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*34.154*/("""
		    	"""),_display_(Seq[Any](/*35.9*/helper/*35.15*/.inputPassword(formulario("senha"), 'id -> "senha", 'class -> "span5",  '_label -> "Senha: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*35.158*/("""
		    	"""),_display_(Seq[Any](/*36.9*/helper/*36.15*/.inputPassword(formulario("confirmacaoSenha"), 'id -> "confirmacaoSenha", 'class -> "span5", '_label -> "Confirme a Senha: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*36.190*/("""
				
				<button type="submit" class="btn btn-primary">Cadastrar Avaliador</button>
				&nbsp;
										 
				 <a class="btn" href=""""),_display_(Seq[Any](/*41.28*/routes/*41.34*/.Administracao.index)),format.raw/*41.54*/("""" >Cancelar</a>
						 
			""")))})),format.raw/*43.5*/("""
			
		</div>
	</div>	

""")))})))}
    }
    
    def render(formulario:Form[Usuario],campus:List[Campus]) = apply(formulario,campus)
    
    def f:((Form[Usuario],List[Campus]) => play.api.templates.Html) = (formulario,campus) => apply(formulario,campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Avaliador/formulario.scala.html
                    HASH: 44bf1415d1c41cffdb85679302d15cfc4f21a1bb
                    MATRIX: 790->1|1003->50|1035->144|1074->149|1085->153|1123->155|1336->333|1351->339|1429->408|1468->409|1513->419|1528->425|1686->560|1731->570|1746->576|1908->715|2152->924|2188->944|2228->946|2291->973|2305->978|2330->981|2369->984|2383->989|2410->994|2460->1013|2640->1158|2655->1164|2817->1303|2862->1313|2877->1319|3043->1462|3088->1472|3103->1478|3301->1653|3477->1793|3492->1799|3534->1819|3595->1849
                    LINES: 27->1|35->1|38->7|40->9|40->9|40->9|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|58->27|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|72->41|72->41|72->41|74->43
                    -- GENERATED --
                */
            