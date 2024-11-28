package com.mustafin.anki.data.repositories.decksRepository

import com.mustafin.anki.utils.deck.DeckModel

interface DecksRepository {
    fun getAllDecks(): List<DeckModel>
    fun addDeck(deck: DeckModel)
    fun deleteDeck(deck: DeckModel)
}