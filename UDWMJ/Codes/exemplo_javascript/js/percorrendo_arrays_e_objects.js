itens_menu = ["Home", "Contato", "Sobre"];

document.write("<ul>");
for (const item of itens_menu) {
    document.write("<li>" + item + "</li>");
}
document.write("</ul>");

const populacoes = {
    "São Paulo": 100000000,
    "Santo Andre": 7000000,
    "Guarulhos": 13000000
};

for (const cidade in populacoes) {
    console.log(`${cidade} tem ${populacoes[cidade]} habitantes.`);
}