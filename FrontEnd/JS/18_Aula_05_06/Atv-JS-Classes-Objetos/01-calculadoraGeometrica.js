class Forma{
    constructor(){
        if(this.constructor === Forma){
            throw new Error('Não é possível instanciar uma classe abstrata');
        }
    }

    area(){
        throw new Error('O método abstrato "area" deve ser implementado');
    }

    perimetro(){
        throw new Error('O método abstrato "perimetro" deve ser implementado');
    }
}

class Retangulo extends Forma{
    constructor(base, altura){
        super();

        this.base=base;
        this.altura=altura;
    }

    area(){
        let area = this.base * this.altura;
        return area  
    }

    perimetro(){
        let perimetro = 2*(this.base + this.altura);
        return perimetro;
    }
}

class Circulo extends Forma{
    constructor(raio){
        super();

        this.raio=raio;
    }

    area(){
        let area = Math.PI * Math.pow(this.raio,2);
        return area;
    }

    perimetro(){
        let perimetro = 2 * Math.PI * this.raio;
        return perimetro;
    }
}

class Triangulo extends Forma{
    constructor(base, altura, lado1, lado2, lado3){
        super();

        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    area(){
        let area = (this.base * this.altura)/2;
        return area;
    }

    perimetro(){
        let perimetro = this.lado1 + this.lado2 + this.lado3;
        return perimetro;
    }
}

const retangulo = new Retangulo(3, 8);
const circulo = new Circulo(8);
const triangulo = new Triangulo(5, 12, 5, 12, 18);

console.log("-----------CALCULADORA DE GEOMETRIA-----------");
console.log("");

console.log(`Área do Retângulo: ${retangulo.area().toFixed(2)} cm²`);
console.log(`Perímetro do Retângulo: ${retangulo.perimetro().toFixed(2)} cm²`);
console.log('-----------------------------------');

console.log(`Área do Círculo: ${circulo.area().toFixed(2)} cm²`);
console.log(`Perímetro do Círculo: ${circulo.perimetro().toFixed(2)} cm²`);
console.log('-----------------------------------');

console.log(`Área do Triângulo: ${triangulo.area().toFixed(2)} cm²`);
console.log(`Perímetro do Triângulo: ${triangulo.perimetro().toFixed(2)} cm²`);
console.log('-----------------------------------');
