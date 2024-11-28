package com.mustafin.anki.data.repositories.cardsRepository

import com.mustafin.anki.data.mappers.toCardModelList
import com.mustafin.anki.data.mappers.toCardsEntity
import com.mustafin.anki.data.source.local.database.AnkiDatabase
import com.mustafin.anki.utils.card.CardModel

/* Репозиторий для работы со списком карточек */
class CardsRepositoryImpl(private val database: AnkiDatabase): CardsRepository {
    private val cardsDao = database.cardsDao()

    override fun getAllCards(): List<CardModel> {
        return cardsDao.getAllCards().toCardModelList()
    }

    override fun getCardsByDeck(deckId: Int): List<CardModel> {
        return cardsDao.getCardsByDeck(deckId).toCardModelList()
    }

    override fun addCard(card: CardModel) {
        return cardsDao.addCard(card.toCardsEntity())
    }

    override fun deleteCard(card: CardModel) {
        return cardsDao.deleteCard(card.toCardsEntity())
    }
}