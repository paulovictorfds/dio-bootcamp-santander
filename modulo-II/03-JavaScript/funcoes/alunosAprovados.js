const alunos = [
    {
        nome: 'João',
        nota: 5,
        turma: '1B',
    },
    {
        nome: 'Sofia',
        nota: 9,
        turma: '1B',
    },
    {
        nome: 'Paulo',
        nota: 6,
        turma: '2C',
    },
    {
        nome: 'Miguel',
        nota: 3,
        turma: '2C',
    },
];

function alunosAprovados(arrayAlunos, mediaFinal) {
    let arrayAprovados = [];
    for(let i = 0; i < arrayAlunos.length; i++) {
        // Object destructuring
        const {nota, nome} = arrayAlunos[i];

        if(nota >= mediaFinal) {            
            arrayAprovados.push(nome);
        }
    }
    return arrayAprovados;
}

console.log(alunosAprovados(alunos, 5));