// @SOURCE:C:/Users/Alessandro/workspace/sigepi-ifrn2/conf/routes
// @HASH:1a77c2c6852531f5b6f7caf8d37a818f0853e7bb
// @DATE:Sat Jan 05 14:06:11 BRST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:11
val controllers_Professores_formulario1 = Route("GET", PathPattern(List(StaticPart("/cadastro-professor"))))
                    

// @LINE:12
val controllers_Professores_cadastrar2 = Route("POST", PathPattern(List(StaticPart("/cadastro-professor"))))
                    

// @LINE:13
val controllers_Gestores_formulario3 = Route("GET", PathPattern(List(StaticPart("/cadastro-gestor"))))
                    

// @LINE:14
val controllers_Gestores_cadastrar4 = Route("POST", PathPattern(List(StaticPart("/cadastro-gestor"))))
                    

// @LINE:15
val controllers_Avaliadores_formulario5 = Route("GET", PathPattern(List(StaticPart("/cadastro-avaliador"))))
                    

// @LINE:16
val controllers_Avaliadores_cadastrar6 = Route("POST", PathPattern(List(StaticPart("/cadastro-avaliador"))))
                    

// @LINE:20
val controllers_Sessions_login7 = Route("GET", PathPattern(List(StaticPart("/acesso"))))
                    

// @LINE:21
val controllers_Sessions_efetuarLogin8 = Route("POST", PathPattern(List(StaticPart("/acessar-minha-conta"))))
                    

// @LINE:22
val controllers_Sessions_efetuarlogout9 = Route("GET", PathPattern(List(StaticPart("/sair-do-sistema"))))
                    

// @LINE:25
val controllers_Administracao_index10 = Route("GET", PathPattern(List(StaticPart("/administracao/admin"))))
                    

// @LINE:29
val controllers_Editais_index11 = Route("GET", PathPattern(List(StaticPart("/administracao/editais"))))
                    

// @LINE:30
val controllers_Editais_visualizar12 = Route("GET", PathPattern(List(StaticPart("/administracao/editais/"),DynamicPart("id", """[^/]+"""),StaticPart("/visualizar"))))
                    

// @LINE:34
val controllers_CampusController_index13 = Route("GET", PathPattern(List(StaticPart("/administracao/campus"))))
                    

// @LINE:35
val controllers_CampusController_visualizar14 = Route("GET", PathPattern(List(StaticPart("/administracao/campus/"),DynamicPart("id", """[^/]+"""),StaticPart("/visualizar"))))
                    

// @LINE:39
val controllers_Projetos_rankingProjetos15 = Route("GET", PathPattern(List(StaticPart("/ranking-dos-projetos/visualizar"))))
                    

// @LINE:46
val controllers_Projetos_index16 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos"))))
                    

// @LINE:47
val controllers_Projetos_formulario17 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/submeter"))))
                    

// @LINE:48
val controllers_Projetos_submeter18 = Route("POST", PathPattern(List(StaticPart("/administracao/projetos/submeter"))))
                    

// @LINE:49
val controllers_Projetos_visualizar19 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/"),DynamicPart("id", """[^/]+"""),StaticPart("/visualizar"))))
                    

// @LINE:50
val controllers_Projetos_meusProjetosAvaliados20 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/avaliados"))))
                    

// @LINE:51
val controllers_Projetos_meusProjetos21 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/meus-projetos"))))
                    

// @LINE:55
val controllers_Projetos_formularioEdicao22 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:56
val controllers_Projetos_editar23 = Route("POST", PathPattern(List(StaticPart("/administracao/projetos/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:57
val controllers_Projetos_deletar24 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/"),DynamicPart("id", """[^/]+"""),StaticPart("/excluir"))))
                    

// @LINE:58
val controllers_Projetos_formularioAvaliacao25 = Route("GET", PathPattern(List(StaticPart("/administracao/projetos/"),DynamicPart("id", """[^/]+"""),StaticPart("/avaliar"))))
                    

// @LINE:59
val controllers_Projetos_avaliacaoProjeto26 = Route("POST", PathPattern(List(StaticPart("/administracao/projetos/avaliar"))))
                    

// @LINE:62
val controllers_Editais_formulario27 = Route("GET", PathPattern(List(StaticPart("/administracao/editais/cadastro"))))
                    

// @LINE:63
val controllers_Editais_cadastrar28 = Route("POST", PathPattern(List(StaticPart("/administracao/editais/cadastro"))))
                    

// @LINE:64
val controllers_Editais_formularioEdicao29 = Route("GET", PathPattern(List(StaticPart("/administracao/editais/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:65
val controllers_Editais_editar30 = Route("POST", PathPattern(List(StaticPart("/administracao/editais/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:66
val controllers_Editais_deletar31 = Route("GET", PathPattern(List(StaticPart("/administracao/editais/"),DynamicPart("id", """[^/]+"""),StaticPart("/excluir"))))
                    

// @LINE:70
val controllers_CampusController_formulario32 = Route("GET", PathPattern(List(StaticPart("/administracao/campus/cadastro"))))
                    

// @LINE:71
val controllers_CampusController_cadastrar33 = Route("POST", PathPattern(List(StaticPart("/administracao/campus/cadastro"))))
                    

// @LINE:72
val controllers_CampusController_formularioEdicao34 = Route("GET", PathPattern(List(StaticPart("/administracao/campus/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:73
val controllers_CampusController_editar35 = Route("POST", PathPattern(List(StaticPart("/administracao/campus/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:74
val controllers_CampusController_deletar36 = Route("GET", PathPattern(List(StaticPart("/administracao/campus/"),DynamicPart("id", """[^/]+"""),StaticPart("/excluir"))))
                    

// @LINE:78
val controllers_Professores_listaProfessores37 = Route("GET", PathPattern(List(StaticPart("/administracao/professores/listagem-professores"))))
                    

// @LINE:79
val controllers_Professores_formularioEdicao38 = Route("GET", PathPattern(List(StaticPart("/administracao/professores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:80
val controllers_Professores_editar39 = Route("POST", PathPattern(List(StaticPart("/administracao/professores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:81
val controllers_Professores_deletar40 = Route("GET", PathPattern(List(StaticPart("/administracao/professores/"),DynamicPart("id", """[^/]+"""),StaticPart("/deletar"))))
                    

// @LINE:82
val controllers_Gestores_listaGestores41 = Route("GET", PathPattern(List(StaticPart("/administracao/gestores/listagem-gestores"))))
                    

// @LINE:83
val controllers_Gestores_formularioEdicao42 = Route("GET", PathPattern(List(StaticPart("/administracao/gestores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:84
val controllers_Gestores_editar43 = Route("POST", PathPattern(List(StaticPart("/administracao/gestores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:85
val controllers_Gestores_deletar44 = Route("GET", PathPattern(List(StaticPart("/administracao/gestores/"),DynamicPart("id", """[^/]+"""),StaticPart("/deletar"))))
                    

// @LINE:86
val controllers_Avaliadores_listaAvaliadores45 = Route("GET", PathPattern(List(StaticPart("/administracao/avaliadores/listagem-avaliadores"))))
                    

// @LINE:87
val controllers_Avaliadores_formularioEdicao46 = Route("GET", PathPattern(List(StaticPart("/administracao/avaliadores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:88
val controllers_Avaliadores_editar47 = Route("POST", PathPattern(List(StaticPart("/administracao/avaliadores/"),DynamicPart("id", """[^/]+"""),StaticPart("/editar"))))
                    

// @LINE:89
val controllers_Avaliadores_deletar48 = Route("GET", PathPattern(List(StaticPart("/administracao/avaliadores/"),DynamicPart("id", """[^/]+"""),StaticPart("/deletar"))))
                    

// @LINE:93
val controllers_Avaliadores_index49 = Route("GET", PathPattern(List(StaticPart("/administracao/avaliador"))))
                    

// @LINE:97
val controllers_Professores_index50 = Route("GET", PathPattern(List(StaticPart("/administracao/professor"))))
                    

// @LINE:101
val controllers_Gestores_index51 = Route("GET", PathPattern(List(StaticPart("/administracao/gestor"))))
                    

// @LINE:114
val controllers_Assets_at52 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/cadastro-professor""","""controllers.Professores.formulario()"""),("""POST""","""/cadastro-professor""","""controllers.Professores.cadastrar()"""),("""GET""","""/cadastro-gestor""","""controllers.Gestores.formulario()"""),("""POST""","""/cadastro-gestor""","""controllers.Gestores.cadastrar()"""),("""GET""","""/cadastro-avaliador""","""controllers.Avaliadores.formulario()"""),("""POST""","""/cadastro-avaliador""","""controllers.Avaliadores.cadastrar()"""),("""GET""","""/acesso""","""controllers.Sessions.login()"""),("""POST""","""/acessar-minha-conta""","""controllers.Sessions.efetuarLogin()"""),("""GET""","""/sair-do-sistema""","""controllers.Sessions.efetuarlogout()"""),("""GET""","""/administracao/admin""","""controllers.Administracao.index()"""),("""GET""","""/administracao/editais""","""controllers.Editais.index()"""),("""GET""","""/administracao/editais/$id<[^/]+>/visualizar""","""controllers.Editais.visualizar(id:Long)"""),("""GET""","""/administracao/campus""","""controllers.CampusController.index()"""),("""GET""","""/administracao/campus/$id<[^/]+>/visualizar""","""controllers.CampusController.visualizar(id:Long)"""),("""GET""","""/ranking-dos-projetos/visualizar""","""controllers.Projetos.rankingProjetos()"""),("""GET""","""/administracao/projetos""","""controllers.Projetos.index()"""),("""GET""","""/administracao/projetos/submeter""","""controllers.Projetos.formulario()"""),("""POST""","""/administracao/projetos/submeter""","""controllers.Projetos.submeter()"""),("""GET""","""/administracao/projetos/$id<[^/]+>/visualizar""","""controllers.Projetos.visualizar(id:Long)"""),("""GET""","""/administracao/projetos/avaliados""","""controllers.Projetos.meusProjetosAvaliados()"""),("""GET""","""/administracao/projetos/meus-projetos""","""controllers.Projetos.meusProjetos()"""),("""GET""","""/administracao/projetos/$id<[^/]+>/editar""","""controllers.Projetos.formularioEdicao(id:Long)"""),("""POST""","""/administracao/projetos/$id<[^/]+>/editar""","""controllers.Projetos.editar(id:Long)"""),("""GET""","""/administracao/projetos/$id<[^/]+>/excluir""","""controllers.Projetos.deletar(id:Long)"""),("""GET""","""/administracao/projetos/$id<[^/]+>/avaliar""","""controllers.Projetos.formularioAvaliacao(id:Long)"""),("""POST""","""/administracao/projetos/avaliar""","""controllers.Projetos.avaliacaoProjeto(id:Long)"""),("""GET""","""/administracao/editais/cadastro""","""controllers.Editais.formulario()"""),("""POST""","""/administracao/editais/cadastro""","""controllers.Editais.cadastrar()"""),("""GET""","""/administracao/editais/$id<[^/]+>/editar""","""controllers.Editais.formularioEdicao(id:Long)"""),("""POST""","""/administracao/editais/$id<[^/]+>/editar""","""controllers.Editais.editar(id:Long)"""),("""GET""","""/administracao/editais/$id<[^/]+>/excluir""","""controllers.Editais.deletar(id:Long)"""),("""GET""","""/administracao/campus/cadastro""","""controllers.CampusController.formulario()"""),("""POST""","""/administracao/campus/cadastro""","""controllers.CampusController.cadastrar()"""),("""GET""","""/administracao/campus/$id<[^/]+>/editar""","""controllers.CampusController.formularioEdicao(id:Long)"""),("""POST""","""/administracao/campus/$id<[^/]+>/editar""","""controllers.CampusController.editar(id:Long)"""),("""GET""","""/administracao/campus/$id<[^/]+>/excluir""","""controllers.CampusController.deletar(id:Long)"""),("""GET""","""/administracao/professores/listagem-professores""","""controllers.Professores.listaProfessores()"""),("""GET""","""/administracao/professores/$id<[^/]+>/editar""","""controllers.Professores.formularioEdicao(id:Long)"""),("""POST""","""/administracao/professores/$id<[^/]+>/editar""","""controllers.Professores.editar(id:Long)"""),("""GET""","""/administracao/professores/$id<[^/]+>/deletar""","""controllers.Professores.deletar(id:Long)"""),("""GET""","""/administracao/gestores/listagem-gestores""","""controllers.Gestores.listaGestores()"""),("""GET""","""/administracao/gestores/$id<[^/]+>/editar""","""controllers.Gestores.formularioEdicao(id:Long)"""),("""POST""","""/administracao/gestores/$id<[^/]+>/editar""","""controllers.Gestores.editar(id:Long)"""),("""GET""","""/administracao/gestores/$id<[^/]+>/deletar""","""controllers.Gestores.deletar(id:Long)"""),("""GET""","""/administracao/avaliadores/listagem-avaliadores""","""controllers.Avaliadores.listaAvaliadores()"""),("""GET""","""/administracao/avaliadores/$id<[^/]+>/editar""","""controllers.Avaliadores.formularioEdicao(id:Long)"""),("""POST""","""/administracao/avaliadores/$id<[^/]+>/editar""","""controllers.Avaliadores.editar(id:Long)"""),("""GET""","""/administracao/avaliadores/$id<[^/]+>/deletar""","""controllers.Avaliadores.deletar(id:Long)"""),("""GET""","""/administracao/avaliador""","""controllers.Avaliadores.index()"""),("""GET""","""/administracao/professor""","""controllers.Professores.index()"""),("""GET""","""/administracao/gestor""","""controllers.Gestores.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:11
case controllers_Professores_formulario1(params) => {
   call { 
        invokeHandler(_root_.controllers.Professores.formulario(), HandlerDef(this, "controllers.Professores", "formulario", Nil))
   }
}
                    

// @LINE:12
case controllers_Professores_cadastrar2(params) => {
   call { 
        invokeHandler(_root_.controllers.Professores.cadastrar(), HandlerDef(this, "controllers.Professores", "cadastrar", Nil))
   }
}
                    

// @LINE:13
case controllers_Gestores_formulario3(params) => {
   call { 
        invokeHandler(_root_.controllers.Gestores.formulario(), HandlerDef(this, "controllers.Gestores", "formulario", Nil))
   }
}
                    

// @LINE:14
case controllers_Gestores_cadastrar4(params) => {
   call { 
        invokeHandler(_root_.controllers.Gestores.cadastrar(), HandlerDef(this, "controllers.Gestores", "cadastrar", Nil))
   }
}
                    

// @LINE:15
case controllers_Avaliadores_formulario5(params) => {
   call { 
        invokeHandler(_root_.controllers.Avaliadores.formulario(), HandlerDef(this, "controllers.Avaliadores", "formulario", Nil))
   }
}
                    

// @LINE:16
case controllers_Avaliadores_cadastrar6(params) => {
   call { 
        invokeHandler(_root_.controllers.Avaliadores.cadastrar(), HandlerDef(this, "controllers.Avaliadores", "cadastrar", Nil))
   }
}
                    

// @LINE:20
case controllers_Sessions_login7(params) => {
   call { 
        invokeHandler(_root_.controllers.Sessions.login(), HandlerDef(this, "controllers.Sessions", "login", Nil))
   }
}
                    

// @LINE:21
case controllers_Sessions_efetuarLogin8(params) => {
   call { 
        invokeHandler(_root_.controllers.Sessions.efetuarLogin(), HandlerDef(this, "controllers.Sessions", "efetuarLogin", Nil))
   }
}
                    

// @LINE:22
case controllers_Sessions_efetuarlogout9(params) => {
   call { 
        invokeHandler(_root_.controllers.Sessions.efetuarlogout(), HandlerDef(this, "controllers.Sessions", "efetuarlogout", Nil))
   }
}
                    

// @LINE:25
case controllers_Administracao_index10(params) => {
   call { 
        invokeHandler(_root_.controllers.Administracao.index(), HandlerDef(this, "controllers.Administracao", "index", Nil))
   }
}
                    

// @LINE:29
case controllers_Editais_index11(params) => {
   call { 
        invokeHandler(_root_.controllers.Editais.index(), HandlerDef(this, "controllers.Editais", "index", Nil))
   }
}
                    

// @LINE:30
case controllers_Editais_visualizar12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Editais.visualizar(id), HandlerDef(this, "controllers.Editais", "visualizar", Seq(classOf[Long])))
   }
}
                    

// @LINE:34
case controllers_CampusController_index13(params) => {
   call { 
        invokeHandler(_root_.controllers.CampusController.index(), HandlerDef(this, "controllers.CampusController", "index", Nil))
   }
}
                    

// @LINE:35
case controllers_CampusController_visualizar14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CampusController.visualizar(id), HandlerDef(this, "controllers.CampusController", "visualizar", Seq(classOf[Long])))
   }
}
                    

// @LINE:39
case controllers_Projetos_rankingProjetos15(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.rankingProjetos(), HandlerDef(this, "controllers.Projetos", "rankingProjetos", Nil))
   }
}
                    

// @LINE:46
case controllers_Projetos_index16(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.index(), HandlerDef(this, "controllers.Projetos", "index", Nil))
   }
}
                    

// @LINE:47
case controllers_Projetos_formulario17(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.formulario(), HandlerDef(this, "controllers.Projetos", "formulario", Nil))
   }
}
                    

// @LINE:48
case controllers_Projetos_submeter18(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.submeter(), HandlerDef(this, "controllers.Projetos", "submeter", Nil))
   }
}
                    

// @LINE:49
case controllers_Projetos_visualizar19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.visualizar(id), HandlerDef(this, "controllers.Projetos", "visualizar", Seq(classOf[Long])))
   }
}
                    

// @LINE:50
case controllers_Projetos_meusProjetosAvaliados20(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.meusProjetosAvaliados(), HandlerDef(this, "controllers.Projetos", "meusProjetosAvaliados", Nil))
   }
}
                    

// @LINE:51
case controllers_Projetos_meusProjetos21(params) => {
   call { 
        invokeHandler(_root_.controllers.Projetos.meusProjetos(), HandlerDef(this, "controllers.Projetos", "meusProjetos", Nil))
   }
}
                    

// @LINE:55
case controllers_Projetos_formularioEdicao22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.formularioEdicao(id), HandlerDef(this, "controllers.Projetos", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:56
case controllers_Projetos_editar23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.editar(id), HandlerDef(this, "controllers.Projetos", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:57
case controllers_Projetos_deletar24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.deletar(id), HandlerDef(this, "controllers.Projetos", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:58
case controllers_Projetos_formularioAvaliacao25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.formularioAvaliacao(id), HandlerDef(this, "controllers.Projetos", "formularioAvaliacao", Seq(classOf[Long])))
   }
}
                    

// @LINE:59
case controllers_Projetos_avaliacaoProjeto26(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Projetos.avaliacaoProjeto(id), HandlerDef(this, "controllers.Projetos", "avaliacaoProjeto", Seq(classOf[Long])))
   }
}
                    

// @LINE:62
case controllers_Editais_formulario27(params) => {
   call { 
        invokeHandler(_root_.controllers.Editais.formulario(), HandlerDef(this, "controllers.Editais", "formulario", Nil))
   }
}
                    

// @LINE:63
case controllers_Editais_cadastrar28(params) => {
   call { 
        invokeHandler(_root_.controllers.Editais.cadastrar(), HandlerDef(this, "controllers.Editais", "cadastrar", Nil))
   }
}
                    

// @LINE:64
case controllers_Editais_formularioEdicao29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Editais.formularioEdicao(id), HandlerDef(this, "controllers.Editais", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:65
case controllers_Editais_editar30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Editais.editar(id), HandlerDef(this, "controllers.Editais", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:66
case controllers_Editais_deletar31(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Editais.deletar(id), HandlerDef(this, "controllers.Editais", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:70
case controllers_CampusController_formulario32(params) => {
   call { 
        invokeHandler(_root_.controllers.CampusController.formulario(), HandlerDef(this, "controllers.CampusController", "formulario", Nil))
   }
}
                    

// @LINE:71
case controllers_CampusController_cadastrar33(params) => {
   call { 
        invokeHandler(_root_.controllers.CampusController.cadastrar(), HandlerDef(this, "controllers.CampusController", "cadastrar", Nil))
   }
}
                    

// @LINE:72
case controllers_CampusController_formularioEdicao34(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CampusController.formularioEdicao(id), HandlerDef(this, "controllers.CampusController", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:73
case controllers_CampusController_editar35(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CampusController.editar(id), HandlerDef(this, "controllers.CampusController", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:74
case controllers_CampusController_deletar36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CampusController.deletar(id), HandlerDef(this, "controllers.CampusController", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:78
case controllers_Professores_listaProfessores37(params) => {
   call { 
        invokeHandler(_root_.controllers.Professores.listaProfessores(), HandlerDef(this, "controllers.Professores", "listaProfessores", Nil))
   }
}
                    

// @LINE:79
case controllers_Professores_formularioEdicao38(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Professores.formularioEdicao(id), HandlerDef(this, "controllers.Professores", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:80
case controllers_Professores_editar39(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Professores.editar(id), HandlerDef(this, "controllers.Professores", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:81
case controllers_Professores_deletar40(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Professores.deletar(id), HandlerDef(this, "controllers.Professores", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:82
case controllers_Gestores_listaGestores41(params) => {
   call { 
        invokeHandler(_root_.controllers.Gestores.listaGestores(), HandlerDef(this, "controllers.Gestores", "listaGestores", Nil))
   }
}
                    

// @LINE:83
case controllers_Gestores_formularioEdicao42(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Gestores.formularioEdicao(id), HandlerDef(this, "controllers.Gestores", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:84
case controllers_Gestores_editar43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Gestores.editar(id), HandlerDef(this, "controllers.Gestores", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:85
case controllers_Gestores_deletar44(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Gestores.deletar(id), HandlerDef(this, "controllers.Gestores", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:86
case controllers_Avaliadores_listaAvaliadores45(params) => {
   call { 
        invokeHandler(_root_.controllers.Avaliadores.listaAvaliadores(), HandlerDef(this, "controllers.Avaliadores", "listaAvaliadores", Nil))
   }
}
                    

// @LINE:87
case controllers_Avaliadores_formularioEdicao46(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Avaliadores.formularioEdicao(id), HandlerDef(this, "controllers.Avaliadores", "formularioEdicao", Seq(classOf[Long])))
   }
}
                    

// @LINE:88
case controllers_Avaliadores_editar47(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Avaliadores.editar(id), HandlerDef(this, "controllers.Avaliadores", "editar", Seq(classOf[Long])))
   }
}
                    

// @LINE:89
case controllers_Avaliadores_deletar48(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Avaliadores.deletar(id), HandlerDef(this, "controllers.Avaliadores", "deletar", Seq(classOf[Long])))
   }
}
                    

// @LINE:93
case controllers_Avaliadores_index49(params) => {
   call { 
        invokeHandler(_root_.controllers.Avaliadores.index(), HandlerDef(this, "controllers.Avaliadores", "index", Nil))
   }
}
                    

// @LINE:97
case controllers_Professores_index50(params) => {
   call { 
        invokeHandler(_root_.controllers.Professores.index(), HandlerDef(this, "controllers.Professores", "index", Nil))
   }
}
                    

// @LINE:101
case controllers_Gestores_index51(params) => {
   call { 
        invokeHandler(_root_.controllers.Gestores.index(), HandlerDef(this, "controllers.Gestores", "index", Nil))
   }
}
                    

// @LINE:114
case controllers_Assets_at52(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                