
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
object visualizar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Projeto,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projeto: Projeto):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helper.twitterBootstrap._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""



""")))})))}
    }
    
    def render(projeto:Projeto) = apply(projeto)
    
    def f:((Projeto) => play.api.templates.Html) = (projeto) => apply(projeto)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/visualizar.scala.html
                    HASH: dc12f3308dd382445a022997caa03de898836b39
                    MATRIX: 770->1|987->19|1015->144|1054->149|1065->153|1103->155
                    LINES: 27->1|37->1|38->6|40->8|40->8|40->8
                    -- GENERATED --
                */
            