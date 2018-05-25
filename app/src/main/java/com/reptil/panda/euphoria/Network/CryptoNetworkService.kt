package com.reptil.panda.euphoria.Network

import io.reactivex.disposables.Disposable
import com.reptil.panda.euphoria.Extensions.uiSubscribe
import com.reptil.panda.euphoria.Model.CurrencyModel


class CryptoNetworkService(private val networkServices: NetworkServices) {

    fun getAllCurrency(onSuccess: (List<CurrencyModel>) -> Unit,
                       onError: (Throwable) -> Unit): Disposable {
        return networkServices.getAllCurrency()
                .uiSubscribe(
                        onNext = { onSuccess(it) },
                        onError = { onError(it) }
                )
    }
}