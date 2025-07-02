import { ButtonReq } from './button.jsx'
import { useEffect, useState } from "react";

export function InicioReact () {
    return ( // Esse <> abaixo e </> é usado como se fosse um fantasma, não aparece no navegador. Tudo precisa está sobre uma "<>, </>" pai.
        <>
            <h1>Olá mundo!</h1>
            <ButtonReq/>
        </>
    ); // A importação e usabilidade do componente importado, tem que ser dentro de um return
}




function MensagemDoBack () {
    const [mensagem, setMensagem] = useState(""); // Definindo o estado atual das constantes
    
    useEffect(() => { // Criando uma função que fará a requisição
        fetch("http://localhost:5000/mensagem") // Faz a requisição
        .then(res => res.json()) // pega a respota que vem em json
        .then(data => setMensagem(data.mensagem)) 
        .catch(err => console.log("Erro", err));
    }, []);
    return (
        <p>{mensagem}</p> // Retorna a resposta no navegador
    )
}

export default MensagemDoBack;