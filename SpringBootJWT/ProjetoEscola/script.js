// Seleciona os elementos do formulário
const formulario = document.querySelector("#form");
const botao = document.querySelector("#button");
const txtnome = document.querySelector("#nome");
const txtusuario = document.querySelector("#usuario");
const txtemail = document.querySelector("#email");
const txtsenha = document.querySelector("#senha");
const txttelefone = document.querySelector("#telefone");

// Função para enviar os dados do formulário
function cadastrar() {
  fetch("http://localhost:3000/api/cadastrar", {
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    method: "POST",
    body: JSON.stringify({
      nomecompleto: txtnome.value,
      usuario: txtusuario.value,
      email: txtemail.value,
      senha: txtsenha.value,
      telefone: txttelefone.value,
    }),
  })
    .then(function (res) {
      console.log(res);
    })
    .catch(function (res) {
      console.log(res);
    });
}

// Função para limpar os campos do formulário
function limparCampos() {
  txtnome.value = "";
  txtusuario.value = "";
  txtemail.value = "";
  txtsenha.value = "";
  txttelefone.value = "";
}

// Adiciona um ouvinte de evento ao botão para enviar o formulário e limpar os campos
botao.addEventListener("click", function (event) {
  event.preventDefault();
  cadastrar();
  limparCampos();
});
