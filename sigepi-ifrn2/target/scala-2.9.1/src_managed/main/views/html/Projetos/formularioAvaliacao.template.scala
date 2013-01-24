
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
object formularioAvaliacao extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[ProjetoAvaliado],Projeto,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[ProjetoAvaliado], projeto: Projeto):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._

import helper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*3.70*/("""

"""),format.raw/*9.1*/("""

"""),_display_(Seq[Any](/*11.2*/main/*11.6*/ {_display_(Seq[Any](format.raw/*11.8*/("""


   """),_display_(Seq[Any](/*14.5*/helper/*14.11*/.form(action = routes.Projetos.avaliacaoProjeto(projeto.id), 'style -> "margin:0;")/*14.94*/{_display_(Seq[Any](format.raw/*14.95*/("""

          """),_display_(Seq[Any](/*16.12*/helper/*16.18*/.inputText(formulario("pontuacaoObtida"), 'id -> "pontuacaoObtida", 'rows -> "15", 'class -> "span2", '_label -> "Pontuação do Projeto: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*16.206*/("""
   
     <button type="submit" class="btn btn-primary">Enviar Pontuação</button>
     
     <a class="btn" href=""""),_display_(Seq[Any](/*20.28*/routes/*20.34*/.Projetos.visualizar(projeto.id))),format.raw/*20.66*/("""" >Cancelar</a>
				
   
   """)))})),format.raw/*23.5*/("""
   

""")))})))}
    }
    
    def render(formulario:Form[ProjetoAvaliado],projeto:Projeto) = apply(formulario,projeto)
    
    def f:((Form[ProjetoAvaliado],Projeto) => play.api.templates.Html) = (formulario,projeto) => apply(formulario,projeto)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/formularioAvaliacao.scala.html
                    HASH: 18a6527d4f131c2edcfe177d2093b1142aa444c1
                    MATRIX: 801->1|1034->54|1065->127|1095->235|1135->240|1147->244|1186->246|1231->256|1246->262|1338->345|1377->346|1428->361|1443->367|1654->555|1809->674|1824->680|1878->712|1941->744
                    LINES: 27->1|37->1|39->3|41->9|43->11|43->11|43->11|46->14|46->14|46->14|46->14|48->16|48->16|48->16|52->20|52->20|52->20|55->23
                    -- GENERATED --
                */
            