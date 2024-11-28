package com.mustafin.anki.data.repositories.cardsRepository

import com.mustafin.anki.utils.card.CardModel

interface CardsRepository {
    fun getAllCards(): List<CardModel>
    fun getCardsByDeck(deckId: Int): List<CardModel>
    fun addCard(card: CardModel)
    fun deleteCard(card: CardModel)
}