
package views.html.Professor

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
				<h1 style="float:left;">Cadastro de Professor</h1>
			</div>
			
			"""),_display_(Seq[Any](/*17.5*/helper/*17.11*/.form(action = routes.Professores.cadastrar(), 'style -> "margin:0;")/*17.80*/{_display_(Seq[Any](format.raw/*17.81*/("""
	    		"""),_display_(Seq[Any](/*18.9*/helper/*18.15*/.inputText(formulario("nome"), 'id -> "nome", 'class -> "span5", '_label -> "Nome: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*18.150*/("""
		    	"""),_display_(Seq[Any](/*19.9*/helper/*19.15*/.inputText(formulario("email"), 'id -> "email", 'class -> "span5",  '_label -> "Email: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*19.154*/("""
		    	
		    	<div class="clearfix" id="idCurso_field">
					<label for="idCampus">Escolha o seu Campus:</label>
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
				
				<button type="submit" class="btn btn-primary">Cadastrar</button>
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
                    DATE: Sun Jan 06 20:59:04 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Professor/formulario.scala.html
                    HASH: 802156e547a1269361c080712eb91deabf95a635
                    MATRIX: 790->1|1003->50|1035->144|1074->149|1085->153|1123->155|1336->333|1351->339|1429->408|1468->409|1513->419|1528->425|1686->560|1731->570|1746->576|1908->715|2156->928|2192->948|2232->950|2295->977|2309->982|2334->985|2373->988|2387->993|2414->998|2464->1017|2644->1162|2659->1168|2821->1307|2866->1317|2881->1323|3047->1466|3092->1476|3107->1482|3305->1657|3471->1787|3486->1793|3528->1813|3589->1843
                    LINES: 27->1|35->1|38->7|40->9|40->9|40->9|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|58->27|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|72->41|72->41|72->41|74->43
                    -- GENERATED --
                */
            