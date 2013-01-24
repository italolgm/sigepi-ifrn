
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
				<h1 style="float:left;">Cadastro de Gestor</h1>
			</div>
			
			"""),_display_(Seq[Any](/*17.5*/helper/*17.11*/.form(action = routes.Gestores.cadastrar(), 'style -> "margin:0;")/*17.77*/{_display_(Seq[Any](format.raw/*17.78*/("""
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
									 
						 <a class="btn" href=""""),_display_(Seq[Any](/*41.30*/routes/*41.36*/.Administracao.index)),format.raw/*41.56*/("""" >Cancelar</a>
		""")))})),format.raw/*42.4*/("""
			
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
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Gestor/formulario.scala.html
                    HASH: 0ac777fae3487852acfcc41349845488dd9b5da5
                    MATRIX: 787->1|1000->50|1032->144|1071->149|1082->153|1120->155|1330->330|1345->336|1420->402|1459->403|1504->413|1519->419|1677->554|1722->564|1737->570|1899->709|2147->922|2183->942|2223->944|2286->971|2300->976|2325->979|2364->982|2378->987|2405->992|2455->1011|2635->1156|2650->1162|2812->1301|2857->1311|2872->1317|3038->1460|3083->1470|3098->1476|3296->1651|3463->1782|3478->1788|3520->1808|3571->1828
                    LINES: 27->1|35->1|38->7|40->9|40->9|40->9|48->17|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|58->27|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|72->41|72->41|72->41|73->42
                    -- GENERATED --
                */
            