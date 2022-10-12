function validarSenhas() {
    var senha = document.getElementById("senha");
    var confirmacao = document.getElementById("confirmacaosenha");
    senha.setCustomValidity("");
    confirmacao.setCustomValidity("");
    // Verifica se a senha e a confirmação são iguais
    if (senha.value !== confirmacao.value) {
        // setCustomValidity() define uma mensagem de erro para o validationMessage
        senha.setCustomValidity("A senha e a confirmação não batem.");
        senha.reportValidity();
        senha.style.backgroundColor = "#FFC0CB";
        confirmacao.setCustomValidity("A senha e a confirmação não batem.");
        confirmacao.reportValidity();
        confirmacao.style.backgroundColor = "#FFC0CB";
        return false;
    }
    var nomeValido = document.getElementById("nome").checkValidity();
    var emailValido = document.getElementById("email").checkValidity();
    var senhaValida = document.getElementById("senha").checkValidity();
    var confirmacaoValida =
        document.getElementById("confirmacaosenha").checkValidity();
    if (!senhaValida || !confirmacaoValida || !nomeValido || !emailValido) {
        return false;
    }
}
alert('Cadastrado com sucesso!');
return true;
