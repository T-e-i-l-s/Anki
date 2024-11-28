package com.mustafin.anki.data.repositories.decksRepository

import com.mustafin.anki.data.mappers.toDeckModelList
import com.mustafin.anki.data.mappers.toDecksEntity
import com.mustafin.anki.data.source.local.database.AnkiDatabase
import com.mustafin.anki.utils.deck.DeckModel

/* Репозиторий для работы с колодами */
class DecksRepositoryImpl(private val database: AnkiDatabase): DecksRepository {
    private val decksDao = database.decksDao()

    override fun getAllDecks(): List<DeckModel> {
        return decksDao.getAllDecks().toDeckModelList()
    }

    override fun addDeck(deck: DeckModel) {
        decksDao.addDeck(deck.toDecksEntity())
    }

    override fun deleteDeck(deck: DeckModel) {
        decksDao.deleteDeck(deck.toDecksEntity())
    }
}