
package views.html.Campus

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Campus],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(campus: List[Campus]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Campus</h1>
				
				"""),_display_(Seq[Any](/*15.6*/if(isLogado())/*15.20*/ {_display_(Seq[Any](format.raw/*15.22*/("""
					"""),_display_(Seq[Any](/*16.7*/if(getUsuarioLogado().isAdministrador)/*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
					<div style="float:right; position:relative; top:8px;">
						<a href=""""),_display_(Seq[Any](/*18.17*/routes/*18.23*/.CampusController.formulario)),format.raw/*18.51*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Campus</a>
					</div>
					""")))})),format.raw/*20.7*/("""
				""")))})),format.raw/*21.6*/("""
			</div>
			
			"""),_display_(Seq[Any](/*24.5*/if(campus.size == 0)/*24.25*/ {_display_(Seq[Any](format.raw/*24.27*/("""
				<h3>Nenhum campus cadastrado.</h3>			
			""")))}/*26.6*/else/*26.11*/{_display_(Seq[Any](format.raw/*26.12*/("""
				"""),_display_(Seq[Any](/*27.6*/for(campi <- campus) yield /*27.26*/ {_display_(Seq[Any](format.raw/*27.28*/("""
				<div class="item-lista">
					<div class="item-lista">
						<div class="item">
							
							<h2>
								<a href=""""),_display_(Seq[Any](/*33.19*/routes/*33.25*/.CampusController.visualizar(campi.id))),format.raw/*33.63*/("""">
									"""),_display_(Seq[Any](/*34.11*/campi/*34.16*/.nome)),format.raw/*34.21*/(""" 
								</a>
							</h2>
							
												
						
						
						<div style=" padding-top:10px;">
							<a href=""""),_display_(Seq[Any](/*42.18*/routes/*42.24*/.CampusController.visualizar(campi.id))),format.raw/*42.62*/("""" class="btn btn-primary"><i class="icon-white icon-list-alt"></i> Visualizar o Campus</a>
							
							"""),_display_(Seq[Any](/*44.9*/if(isLogado())/*44.23*/ {_display_(Seq[Any](format.raw/*44.25*/("""
								"""),_display_(Seq[Any](/*45.10*/if(getUsuarioLogado().isAdministrador)/*45.48*/ {_display_(Seq[Any](format.raw/*45.50*/("""
									<a href=""""),_display_(Seq[Any](/*46.20*/routes/*46.26*/.CampusController.editar(campi.id))),format.raw/*46.60*/("""" class="btn"><i class="icon-edit"></i> Editar</a>
									<a href=""""),_display_(Seq[Any](/*47.20*/routes/*47.26*/.CampusController.deletar(campi.id))),format.raw/*47.61*/("""" onclick="return confirm('Deseja realmente excluir o campus &quot;"""),_display_(Seq[Any](/*47.129*/campi/*47.134*/.nome)),format.raw/*47.139*/("""&quot;?')" class="btn"><i class="icon-remove"></i> Excluir</a>
								""")))})),format.raw/*48.10*/("""
							""")))})),format.raw/*49.9*/("""
						</div>
						
						 <br /><br />
						
						</div> 
					</div>
				</div>
				""")))})),format.raw/*57.6*/("""
			""")))})),format.raw/*58.5*/("""
		</div>
		</div>
	

""")))})))}
    }
    
    def render(campus:List[Campus]) = apply(campus)
    
    def f:((List[Campus]) => play.api.templates.Html) = (campus) => apply(campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Campus/index.scala.html
                    HASH: b77ce7b5445a1719db13618fefa5752c5a089190
                    MATRIX: 768->1|954->23|984->115|1023->120|1034->124|1072->126|1274->293|1297->307|1337->309|1380->317|1427->355|1467->357|1582->436|1597->442|1647->470|1764->556|1802->563|1859->585|1888->605|1928->607|1995->657|2008->662|2047->663|2089->670|2125->690|2165->692|2330->821|2345->827|2405->865|2455->879|2469->884|2496->889|2659->1016|2674->1022|2734->1060|2878->1169|2901->1183|2941->1185|2988->1196|3035->1234|3075->1236|3132->1257|3147->1263|3203->1297|3310->1368|3325->1374|3382->1409|3487->1477|3502->1482|3530->1487|3635->1560|3676->1570|3805->1668|3842->1674
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|51->20|52->21|55->24|55->24|55->24|57->26|57->26|57->26|58->27|58->27|58->27|64->33|64->33|64->33|65->34|65->34|65->34|73->42|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|79->48|80->49|88->57|89->58
                    -- GENERATED --
                */
            