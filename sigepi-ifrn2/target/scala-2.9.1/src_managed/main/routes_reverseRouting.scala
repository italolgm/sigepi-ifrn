// @SOURCE:C:/Users/Alessandro/workspace/sigepi-ifrn2/conf/routes
// @HASH:1a77c2c6852531f5b6f7caf8d37a818f0853e7bb
// @DATE:Sat Jan 05 14:06:11 BRST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:114
// @LINE:101
// @LINE:97
// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:30
// @LINE:29
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers {

// @LINE:114
class ReverseAssets {
    


 
// @LINE:114
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:30
// @LINE:29
class ReverseEditais {
    


 
// @LINE:65
def editar(id:Long) = {
   Call("POST", "/administracao/editais/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:63
def cadastrar() = {
   Call("POST", "/administracao/editais/cadastro")
}
                                                        
 
// @LINE:64
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/editais/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:29
def index() = {
   Call("GET", "/administracao/editais")
}
                                                        
 
// @LINE:66
def deletar(id:Long) = {
   Call("GET", "/administracao/editais/" + implicitly[PathBindable[Long]].unbind("id", id) + "/excluir")
}
                                                        
 
// @LINE:30
def visualizar(id:Long) = {
   Call("GET", "/administracao/editais/" + implicitly[PathBindable[Long]].unbind("id", id) + "/visualizar")
}
                                                        
 
// @LINE:62
def formulario() = {
   Call("GET", "/administracao/editais/cadastro")
}
                                                        

                      
    
}
                            

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
class ReverseProjetos {
    


 
// @LINE:51
def meusProjetos() = {
   Call("GET", "/administracao/projetos/meus-projetos")
}
                                                        
 
// @LINE:50
def meusProjetosAvaliados() = {
   Call("GET", "/administracao/projetos/avaliados")
}
                                                        
 
// @LINE:56
def editar(id:Long) = {
   Call("POST", "/administracao/projetos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:58
def formularioAvaliacao(id:Long) = {
   Call("GET", "/administracao/projetos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/avaliar")
}
                                                        
 
// @LINE:55
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/projetos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:59
def avaliacaoProjeto(id:Long) = {
   Call("POST", "/administracao/projetos/avaliar" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                        
 
// @LINE:39
def rankingProjetos() = {
   Call("GET", "/ranking-dos-projetos/visualizar")
}
                                                        
 
// @LINE:46
def index() = {
   Call("GET", "/administracao/projetos")
}
                                                        
 
// @LINE:57
def deletar(id:Long) = {
   Call("GET", "/administracao/projetos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/excluir")
}
                                                        
 
// @LINE:49
def visualizar(id:Long) = {
   Call("GET", "/administracao/projetos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/visualizar")
}
                                                        
 
// @LINE:48
def submeter() = {
   Call("POST", "/administracao/projetos/submeter")
}
                                                        
 
// @LINE:47
def formulario() = {
   Call("GET", "/administracao/projetos/submeter")
}
                                                        

                      
    
}
                            

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:35
// @LINE:34
class ReverseCampusController {
    


 
// @LINE:73
def editar(id:Long) = {
   Call("POST", "/administracao/campus/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:71
def cadastrar() = {
   Call("POST", "/administracao/campus/cadastro")
}
                                                        
 
// @LINE:72
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/campus/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:34
def index() = {
   Call("GET", "/administracao/campus")
}
                                                        
 
// @LINE:74
def deletar(id:Long) = {
   Call("GET", "/administracao/campus/" + implicitly[PathBindable[Long]].unbind("id", id) + "/excluir")
}
                                                        
 
// @LINE:35
def visualizar(id:Long) = {
   Call("GET", "/administracao/campus/" + implicitly[PathBindable[Long]].unbind("id", id) + "/visualizar")
}
                                                        
 
// @LINE:70
def formulario() = {
   Call("GET", "/administracao/campus/cadastro")
}
                                                        

                      
    
}
                            

// @LINE:25
class ReverseAdministracao {
    


 
// @LINE:25
def index() = {
   Call("GET", "/administracao/admin")
}
                                                        

                      
    
}
                            

// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:16
// @LINE:15
class ReverseAvaliadores {
    


 
// @LINE:88
def editar(id:Long) = {
   Call("POST", "/administracao/avaliadores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:16
def cadastrar() = {
   Call("POST", "/cadastro-avaliador")
}
                                                        
 
// @LINE:87
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/avaliadores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:86
def listaAvaliadores() = {
   Call("GET", "/administracao/avaliadores/listagem-avaliadores")
}
                                                        
 
// @LINE:93
def index() = {
   Call("GET", "/administracao/avaliador")
}
                                                        
 
// @LINE:89
def deletar(id:Long) = {
   Call("GET", "/administracao/avaliadores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deletar")
}
                                                        
 
// @LINE:15
def formulario() = {
   Call("GET", "/cadastro-avaliador")
}
                                                        

                      
    
}
                            

// @LINE:97
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:12
// @LINE:11
class ReverseProfessores {
    


 
// @LINE:80
def editar(id:Long) = {
   Call("POST", "/administracao/professores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:12
def cadastrar() = {
   Call("POST", "/cadastro-professor")
}
                                                        
 
// @LINE:79
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/professores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:97
def index() = {
   Call("GET", "/administracao/professor")
}
                                                        
 
// @LINE:81
def deletar(id:Long) = {
   Call("GET", "/administracao/professores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deletar")
}
                                                        
 
// @LINE:11
def formulario() = {
   Call("GET", "/cadastro-professor")
}
                                                        
 
// @LINE:78
def listaProfessores() = {
   Call("GET", "/administracao/professores/listagem-professores")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSessions {
    


 
// @LINE:21
def efetuarLogin() = {
   Call("POST", "/acessar-minha-conta")
}
                                                        
 
// @LINE:20
def login() = {
   Call("GET", "/acesso")
}
                                                        
 
// @LINE:22
def efetuarlogout() = {
   Call("GET", "/sair-do-sistema")
}
                                                        

                      
    
}
                            

// @LINE:101
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:14
// @LINE:13
class ReverseGestores {
    


 
// @LINE:84
def editar(id:Long) = {
   Call("POST", "/administracao/gestores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:14
def cadastrar() = {
   Call("POST", "/cadastro-gestor")
}
                                                        
 
// @LINE:82
def listaGestores() = {
   Call("GET", "/administracao/gestores/listagem-gestores")
}
                                                        
 
// @LINE:83
def formularioEdicao(id:Long) = {
   Call("GET", "/administracao/gestores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/editar")
}
                                                        
 
// @LINE:101
def index() = {
   Call("GET", "/administracao/gestor")
}
                                                        
 
// @LINE:85
def deletar(id:Long) = {
   Call("GET", "/administracao/gestores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/deletar")
}
                                                        
 
// @LINE:13
def formulario() = {
   Call("GET", "/cadastro-gestor")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:114
// @LINE:101
// @LINE:97
// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:30
// @LINE:29
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers.javascript {

// @LINE:114
class ReverseAssets {
    


 
// @LINE:114
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:30
// @LINE:29
class ReverseEditais {
    


 
// @LINE:65
def editar = JavascriptReverseRoute(
   "controllers.Editais.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/editais/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:63
def cadastrar = JavascriptReverseRoute(
   "controllers.Editais.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"/administracao/editais/cadastro"})
      }
   """
)
                                                        
 
// @LINE:64
def formularioEdicao = JavascriptReverseRoute(
   "controllers.Editais.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/editais/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:29
def index = JavascriptReverseRoute(
   "controllers.Editais.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/editais"})
      }
   """
)
                                                        
 
// @LINE:66
def deletar = JavascriptReverseRoute(
   "controllers.Editais.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/editais/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/excluir"})
      }
   """
)
                                                        
 
// @LINE:30
def visualizar = JavascriptReverseRoute(
   "controllers.Editais.visualizar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/editais/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/visualizar"})
      }
   """
)
                                                        
 
// @LINE:62
def formulario = JavascriptReverseRoute(
   "controllers.Editais.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/editais/cadastro"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
class ReverseProjetos {
    


 
// @LINE:51
def meusProjetos = JavascriptReverseRoute(
   "controllers.Projetos.meusProjetos",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/projetos/meus-projetos"})
      }
   """
)
                                                        
 
// @LINE:50
def meusProjetosAvaliados = JavascriptReverseRoute(
   "controllers.Projetos.meusProjetosAvaliados",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/projetos/avaliados"})
      }
   """
)
                                                        
 
// @LINE:56
def editar = JavascriptReverseRoute(
   "controllers.Projetos.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/projetos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:58
def formularioAvaliacao = JavascriptReverseRoute(
   "controllers.Projetos.formularioAvaliacao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/projetos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/avaliar"})
      }
   """
)
                                                        
 
// @LINE:55
def formularioEdicao = JavascriptReverseRoute(
   "controllers.Projetos.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/projetos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:59
def avaliacaoProjeto = JavascriptReverseRoute(
   "controllers.Projetos.avaliacaoProjeto",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/projetos/avaliar" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                                                        
 
// @LINE:39
def rankingProjetos = JavascriptReverseRoute(
   "controllers.Projetos.rankingProjetos",
   """
      function() {
      return _wA({method:"GET", url:"/ranking-dos-projetos/visualizar"})
      }
   """
)
                                                        
 
// @LINE:46
def index = JavascriptReverseRoute(
   "controllers.Projetos.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/projetos"})
      }
   """
)
                                                        
 
// @LINE:57
def deletar = JavascriptReverseRoute(
   "controllers.Projetos.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/projetos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/excluir"})
      }
   """
)
                                                        
 
// @LINE:49
def visualizar = JavascriptReverseRoute(
   "controllers.Projetos.visualizar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/projetos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/visualizar"})
      }
   """
)
                                                        
 
// @LINE:48
def submeter = JavascriptReverseRoute(
   "controllers.Projetos.submeter",
   """
      function() {
      return _wA({method:"POST", url:"/administracao/projetos/submeter"})
      }
   """
)
                                                        
 
// @LINE:47
def formulario = JavascriptReverseRoute(
   "controllers.Projetos.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/projetos/submeter"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:35
// @LINE:34
class ReverseCampusController {
    


 
// @LINE:73
def editar = JavascriptReverseRoute(
   "controllers.CampusController.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/campus/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:71
def cadastrar = JavascriptReverseRoute(
   "controllers.CampusController.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"/administracao/campus/cadastro"})
      }
   """
)
                                                        
 
// @LINE:72
def formularioEdicao = JavascriptReverseRoute(
   "controllers.CampusController.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/campus/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:34
def index = JavascriptReverseRoute(
   "controllers.CampusController.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/campus"})
      }
   """
)
                                                        
 
// @LINE:74
def deletar = JavascriptReverseRoute(
   "controllers.CampusController.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/campus/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/excluir"})
      }
   """
)
                                                        
 
// @LINE:35
def visualizar = JavascriptReverseRoute(
   "controllers.CampusController.visualizar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/campus/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/visualizar"})
      }
   """
)
                                                        
 
// @LINE:70
def formulario = JavascriptReverseRoute(
   "controllers.CampusController.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/campus/cadastro"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:25
class ReverseAdministracao {
    


 
// @LINE:25
def index = JavascriptReverseRoute(
   "controllers.Administracao.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/admin"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:16
// @LINE:15
class ReverseAvaliadores {
    


 
// @LINE:88
def editar = JavascriptReverseRoute(
   "controllers.Avaliadores.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/avaliadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:16
def cadastrar = JavascriptReverseRoute(
   "controllers.Avaliadores.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"/cadastro-avaliador"})
      }
   """
)
                                                        
 
// @LINE:87
def formularioEdicao = JavascriptReverseRoute(
   "controllers.Avaliadores.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/avaliadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:86
def listaAvaliadores = JavascriptReverseRoute(
   "controllers.Avaliadores.listaAvaliadores",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/avaliadores/listagem-avaliadores"})
      }
   """
)
                                                        
 
// @LINE:93
def index = JavascriptReverseRoute(
   "controllers.Avaliadores.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/avaliador"})
      }
   """
)
                                                        
 
// @LINE:89
def deletar = JavascriptReverseRoute(
   "controllers.Avaliadores.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/avaliadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deletar"})
      }
   """
)
                                                        
 
// @LINE:15
def formulario = JavascriptReverseRoute(
   "controllers.Avaliadores.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/cadastro-avaliador"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:97
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:12
// @LINE:11
class ReverseProfessores {
    


 
// @LINE:80
def editar = JavascriptReverseRoute(
   "controllers.Professores.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/professores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:12
def cadastrar = JavascriptReverseRoute(
   "controllers.Professores.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"/cadastro-professor"})
      }
   """
)
                                                        
 
// @LINE:79
def formularioEdicao = JavascriptReverseRoute(
   "controllers.Professores.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/professores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:97
def index = JavascriptReverseRoute(
   "controllers.Professores.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/professor"})
      }
   """
)
                                                        
 
// @LINE:81
def deletar = JavascriptReverseRoute(
   "controllers.Professores.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/professores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deletar"})
      }
   """
)
                                                        
 
// @LINE:11
def formulario = JavascriptReverseRoute(
   "controllers.Professores.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/cadastro-professor"})
      }
   """
)
                                                        
 
// @LINE:78
def listaProfessores = JavascriptReverseRoute(
   "controllers.Professores.listaProfessores",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/professores/listagem-professores"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSessions {
    


 
// @LINE:21
def efetuarLogin = JavascriptReverseRoute(
   "controllers.Sessions.efetuarLogin",
   """
      function() {
      return _wA({method:"POST", url:"/acessar-minha-conta"})
      }
   """
)
                                                        
 
// @LINE:20
def login = JavascriptReverseRoute(
   "controllers.Sessions.login",
   """
      function() {
      return _wA({method:"GET", url:"/acesso"})
      }
   """
)
                                                        
 
// @LINE:22
def efetuarlogout = JavascriptReverseRoute(
   "controllers.Sessions.efetuarlogout",
   """
      function() {
      return _wA({method:"GET", url:"/sair-do-sistema"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:101
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:14
// @LINE:13
class ReverseGestores {
    


 
// @LINE:84
def editar = JavascriptReverseRoute(
   "controllers.Gestores.editar",
   """
      function(id) {
      return _wA({method:"POST", url:"/administracao/gestores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:14
def cadastrar = JavascriptReverseRoute(
   "controllers.Gestores.cadastrar",
   """
      function() {
      return _wA({method:"POST", url:"/cadastro-gestor"})
      }
   """
)
                                                        
 
// @LINE:82
def listaGestores = JavascriptReverseRoute(
   "controllers.Gestores.listaGestores",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/gestores/listagem-gestores"})
      }
   """
)
                                                        
 
// @LINE:83
def formularioEdicao = JavascriptReverseRoute(
   "controllers.Gestores.formularioEdicao",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/gestores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/editar"})
      }
   """
)
                                                        
 
// @LINE:101
def index = JavascriptReverseRoute(
   "controllers.Gestores.index",
   """
      function() {
      return _wA({method:"GET", url:"/administracao/gestor"})
      }
   """
)
                                                        
 
// @LINE:85
def deletar = JavascriptReverseRoute(
   "controllers.Gestores.deletar",
   """
      function(id) {
      return _wA({method:"GET", url:"/administracao/gestores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/deletar"})
      }
   """
)
                                                        
 
// @LINE:13
def formulario = JavascriptReverseRoute(
   "controllers.Gestores.formulario",
   """
      function() {
      return _wA({method:"GET", url:"/cadastro-gestor"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:114
// @LINE:101
// @LINE:97
// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
// @LINE:35
// @LINE:34
// @LINE:30
// @LINE:29
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
package controllers.ref {

// @LINE:114
class ReverseAssets {
    


 
// @LINE:114
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:30
// @LINE:29
class ReverseEditais {
    


 
// @LINE:65
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Editais.editar(id), HandlerDef(this, "controllers.Editais", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:63
def cadastrar() = new play.api.mvc.HandlerRef(
   controllers.Editais.cadastrar(), HandlerDef(this, "controllers.Editais", "cadastrar", Seq())
)
                              
 
// @LINE:64
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Editais.formularioEdicao(id), HandlerDef(this, "controllers.Editais", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:29
def index() = new play.api.mvc.HandlerRef(
   controllers.Editais.index(), HandlerDef(this, "controllers.Editais", "index", Seq())
)
                              
 
// @LINE:66
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Editais.deletar(id), HandlerDef(this, "controllers.Editais", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:30
def visualizar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Editais.visualizar(id), HandlerDef(this, "controllers.Editais", "visualizar", Seq(classOf[Long]))
)
                              
 
// @LINE:62
def formulario() = new play.api.mvc.HandlerRef(
   controllers.Editais.formulario(), HandlerDef(this, "controllers.Editais", "formulario", Seq())
)
                              

                      
    
}
                            

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:39
class ReverseProjetos {
    


 
// @LINE:51
def meusProjetos() = new play.api.mvc.HandlerRef(
   controllers.Projetos.meusProjetos(), HandlerDef(this, "controllers.Projetos", "meusProjetos", Seq())
)
                              
 
// @LINE:50
def meusProjetosAvaliados() = new play.api.mvc.HandlerRef(
   controllers.Projetos.meusProjetosAvaliados(), HandlerDef(this, "controllers.Projetos", "meusProjetosAvaliados", Seq())
)
                              
 
// @LINE:56
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.editar(id), HandlerDef(this, "controllers.Projetos", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:58
def formularioAvaliacao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.formularioAvaliacao(id), HandlerDef(this, "controllers.Projetos", "formularioAvaliacao", Seq(classOf[Long]))
)
                              
 
// @LINE:55
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.formularioEdicao(id), HandlerDef(this, "controllers.Projetos", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:59
def avaliacaoProjeto(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.avaliacaoProjeto(id), HandlerDef(this, "controllers.Projetos", "avaliacaoProjeto", Seq(classOf[Long]))
)
                              
 
// @LINE:39
def rankingProjetos() = new play.api.mvc.HandlerRef(
   controllers.Projetos.rankingProjetos(), HandlerDef(this, "controllers.Projetos", "rankingProjetos", Seq())
)
                              
 
// @LINE:46
def index() = new play.api.mvc.HandlerRef(
   controllers.Projetos.index(), HandlerDef(this, "controllers.Projetos", "index", Seq())
)
                              
 
// @LINE:57
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.deletar(id), HandlerDef(this, "controllers.Projetos", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:49
def visualizar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Projetos.visualizar(id), HandlerDef(this, "controllers.Projetos", "visualizar", Seq(classOf[Long]))
)
                              
 
// @LINE:48
def submeter() = new play.api.mvc.HandlerRef(
   controllers.Projetos.submeter(), HandlerDef(this, "controllers.Projetos", "submeter", Seq())
)
                              
 
// @LINE:47
def formulario() = new play.api.mvc.HandlerRef(
   controllers.Projetos.formulario(), HandlerDef(this, "controllers.Projetos", "formulario", Seq())
)
                              

                      
    
}
                            

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:35
// @LINE:34
class ReverseCampusController {
    


 
// @LINE:73
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CampusController.editar(id), HandlerDef(this, "controllers.CampusController", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:71
def cadastrar() = new play.api.mvc.HandlerRef(
   controllers.CampusController.cadastrar(), HandlerDef(this, "controllers.CampusController", "cadastrar", Seq())
)
                              
 
// @LINE:72
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CampusController.formularioEdicao(id), HandlerDef(this, "controllers.CampusController", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:34
def index() = new play.api.mvc.HandlerRef(
   controllers.CampusController.index(), HandlerDef(this, "controllers.CampusController", "index", Seq())
)
                              
 
// @LINE:74
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CampusController.deletar(id), HandlerDef(this, "controllers.CampusController", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:35
def visualizar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CampusController.visualizar(id), HandlerDef(this, "controllers.CampusController", "visualizar", Seq(classOf[Long]))
)
                              
 
// @LINE:70
def formulario() = new play.api.mvc.HandlerRef(
   controllers.CampusController.formulario(), HandlerDef(this, "controllers.CampusController", "formulario", Seq())
)
                              

                      
    
}
                            

// @LINE:25
class ReverseAdministracao {
    


 
// @LINE:25
def index() = new play.api.mvc.HandlerRef(
   controllers.Administracao.index(), HandlerDef(this, "controllers.Administracao", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:93
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:16
// @LINE:15
class ReverseAvaliadores {
    


 
// @LINE:88
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.editar(id), HandlerDef(this, "controllers.Avaliadores", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def cadastrar() = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.cadastrar(), HandlerDef(this, "controllers.Avaliadores", "cadastrar", Seq())
)
                              
 
// @LINE:87
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.formularioEdicao(id), HandlerDef(this, "controllers.Avaliadores", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:86
def listaAvaliadores() = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.listaAvaliadores(), HandlerDef(this, "controllers.Avaliadores", "listaAvaliadores", Seq())
)
                              
 
// @LINE:93
def index() = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.index(), HandlerDef(this, "controllers.Avaliadores", "index", Seq())
)
                              
 
// @LINE:89
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.deletar(id), HandlerDef(this, "controllers.Avaliadores", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def formulario() = new play.api.mvc.HandlerRef(
   controllers.Avaliadores.formulario(), HandlerDef(this, "controllers.Avaliadores", "formulario", Seq())
)
                              

                      
    
}
                            

// @LINE:97
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:12
// @LINE:11
class ReverseProfessores {
    


 
// @LINE:80
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Professores.editar(id), HandlerDef(this, "controllers.Professores", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def cadastrar() = new play.api.mvc.HandlerRef(
   controllers.Professores.cadastrar(), HandlerDef(this, "controllers.Professores", "cadastrar", Seq())
)
                              
 
// @LINE:79
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Professores.formularioEdicao(id), HandlerDef(this, "controllers.Professores", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:97
def index() = new play.api.mvc.HandlerRef(
   controllers.Professores.index(), HandlerDef(this, "controllers.Professores", "index", Seq())
)
                              
 
// @LINE:81
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Professores.deletar(id), HandlerDef(this, "controllers.Professores", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def formulario() = new play.api.mvc.HandlerRef(
   controllers.Professores.formulario(), HandlerDef(this, "controllers.Professores", "formulario", Seq())
)
                              
 
// @LINE:78
def listaProfessores() = new play.api.mvc.HandlerRef(
   controllers.Professores.listaProfessores(), HandlerDef(this, "controllers.Professores", "listaProfessores", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSessions {
    


 
// @LINE:21
def efetuarLogin() = new play.api.mvc.HandlerRef(
   controllers.Sessions.efetuarLogin(), HandlerDef(this, "controllers.Sessions", "efetuarLogin", Seq())
)
                              
 
// @LINE:20
def login() = new play.api.mvc.HandlerRef(
   controllers.Sessions.login(), HandlerDef(this, "controllers.Sessions", "login", Seq())
)
                              
 
// @LINE:22
def efetuarlogout() = new play.api.mvc.HandlerRef(
   controllers.Sessions.efetuarlogout(), HandlerDef(this, "controllers.Sessions", "efetuarlogout", Seq())
)
                              

                      
    
}
                            

// @LINE:101
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:14
// @LINE:13
class ReverseGestores {
    


 
// @LINE:84
def editar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Gestores.editar(id), HandlerDef(this, "controllers.Gestores", "editar", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def cadastrar() = new play.api.mvc.HandlerRef(
   controllers.Gestores.cadastrar(), HandlerDef(this, "controllers.Gestores", "cadastrar", Seq())
)
                              
 
// @LINE:82
def listaGestores() = new play.api.mvc.HandlerRef(
   controllers.Gestores.listaGestores(), HandlerDef(this, "controllers.Gestores", "listaGestores", Seq())
)
                              
 
// @LINE:83
def formularioEdicao(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Gestores.formularioEdicao(id), HandlerDef(this, "controllers.Gestores", "formularioEdicao", Seq(classOf[Long]))
)
                              
 
// @LINE:101
def index() = new play.api.mvc.HandlerRef(
   controllers.Gestores.index(), HandlerDef(this, "controllers.Gestores", "index", Seq())
)
                              
 
// @LINE:85
def deletar(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Gestores.deletar(id), HandlerDef(this, "controllers.Gestores", "deletar", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def formulario() = new play.api.mvc.HandlerRef(
   controllers.Gestores.formulario(), HandlerDef(this, "controllers.Gestores", "formulario", Seq())
)
                              

                      
    
}
                            
}
                    
                