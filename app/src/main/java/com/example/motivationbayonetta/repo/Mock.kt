package com.example.motivationbayonetta.repo


import com.example.motivationbayonetta.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val category: Int)

class Mock {

    private val all = MotivationConstants.PHRASEFILTER.ALL
    private val happy = MotivationConstants.PHRASEFILTER.HAPPY
    private val sunny = MotivationConstants.PHRASEFILTER.SUNNY

    private val listPhrases: List<Phrase> = listOf(
        Phrase("Vamos ao rock, baby!", happy),
        Phrase("Você é tudo o que eu desejo\n" +
                "Tudo o que eu cultuo e adoro\n" +
                "Em outras palavras, por favor seja verdadeiro\n" +
                "Em outras palavras, eu te amo", happy),
        Phrase("Let's dance, boys!", happy),
        Phrase("Se você precisa aprender a falar com uma dama, pergunte a sua mãe!", happy),
        Phrase("Acha que você tem uma chance?", happy),
        Phrase("Tente acompanhar!", happy),
        Phrase("Isso é tudo que você tem?", happy),
        Phrase("Se vou perder tempo, prefiro fazê-lo em um bom banho quente.", happy),

        Phrase("Já é hora de me mexer de novo.", sunny),
        Phrase("Perdeu seu terninho?", sunny),
        Phrase("Não há necessidade de ser gentil.", sunny),
        Phrase("Você tem sido travesso!", sunny),
        Phrase("Meoww", sunny),
        Phrase("Gostou do meu novo corte de cabelo?", sunny),

    )

    // Obtém frase aleatória de acordo com o filtro
    fun getPhrase(value: Int): String {
        val filtered = listPhrases.filter { (it.category == value || value == all) }

        // Número aleatório de 0 ao tamanho da lista retornada do filtro
        val rand = Random.nextInt(filtered.size)

        // Retorna string
        return filtered[rand].description
    }

}

