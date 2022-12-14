fun ex01() {
    println("Digite o cargo: ")
    val cargo = readLine()

    if (cargo == "gerente")
    {
        println("Recebe R$ 2.000,00 de bônus")
    }
    else if (cargo == "coordenador")
    {
        println("Recebe R$ 1.500,00 de bônus")
    }
    else if (cargo == "engenheiro de software")
    {
        println("Recebe R$ 1.000,00 de bônus")
    }
    else if (cargo == "estagiario")
    {
        println("Recebe R$ 500,00 de bônus")
    }
    else
    {
        println("Cargo não listado!")
    }
}

fun ex02() {
    print("Digite o cargo: ")
    val cargo = readLine()

    println("Digite o tempo experiência(anos): ")
    val xp = readLine().toString().toInt()

    if (cargo == "gerente") {
        if (xp <2) {
            println("Recebe R$ 2.000,00 de bônus")
        }
        else {
            println("Recebe R$ 3.000,00 de bônus")
        }
    }
    else if (cargo == "coordenador") {
        if (xp <1)
        {
            println("Recebe R$ 1.500,00 de bônus")
        }
        else
        {
            println("Recebe R$ 1.800,00 de bônus")
        }
    }
    else if (cargo == "engenheiro de software") {
        println("Recebe R$ 1.000,00 de bônus")
    }
    else if (cargo == "estagiario") {
        println("Recebe R$ 500,00 de bônus")
    }
    else {
        println("Cargo não listado!")
    }
}

fun ex03() {
    //A) a reposta certa é false
    //B) a resposta certa é true
    //C) a resposta certa é false
    //D) a resposta certa é true
}

fun main() {
    ex01()
    ex02()
}