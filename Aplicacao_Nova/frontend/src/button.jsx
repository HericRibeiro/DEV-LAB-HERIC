export function ButtonReq () { // Criando e exportando esse componente, a exportação ficara no App 
    function Clique () { // Função para ser acionada quando houver um clique no elemento
        alert("O botão foi clicado") // mensagem de alerta no navegador (Básico do JavaScript)
    }
    return (
        <button onClick={Clique}>Clique aqui</button> // Todo componente deve retonar algo
    );
}
