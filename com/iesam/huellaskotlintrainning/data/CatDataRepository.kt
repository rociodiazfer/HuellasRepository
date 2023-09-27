package com.iesam.huellaskotlintrainning.data

import com.iesam.huellaskotlintrainning.app.Either
import com.iesam.huellaskotlintrainning.data.local.CatFileLocalDataSource
import com.iesam.huellaskotlintrainning.data.remote.CatApiRemoteDataSource
import com.iesam.huellaskotlintrainning.domain.Cat
import com.iesam.huellaskotlintrainning.domain.CatRepository
import com.iesam.huellaskotlintrainning.domain.errors.ErrorApp

class CatDataRepository(
    val localSource: CatFileLocalDataSource,
    val apiSource: CatApiRemoteDataSource
) : CatRepository {

    /*
     Lógica a seguir.
     - Si existe en local, se devuelve lo que hay en local.
     - Si no existe en local, se obtiene de red, se guarda en local y se devuelve el listado obtenido de red
     - Si da error, devolvemos el error.
     */
    fun getAllOk(): Either<ErrorApp, List<Cat>> {
        if(getAllOk().isRight()){
            val lista =getAllOk().get()
        }else{

        }
        return apiSource.getCats()
    }

    /*
     Lógica a seguir.
     - Se obtiene de red con la respuesta sin errores.
     - Se guarda en local.
     - Se obtiene de red con la respuesta de errores.
     - Nos devuelve un error, devolvemos lo de local
     */
    fun getAllError(): Either<ErrorApp, List<Cat>> {
             return apiSource.getCats()
    }

    /*
     Lógica a seguir.
     - Se obtiene de red con la respuesta con errores.
     - Se devuelve al dominio
     */
    fun getAllError2(): Either<ErrorApp, List<Cat>> {
        //Cambiar esto
        return apiSource.getCats()
    }
}