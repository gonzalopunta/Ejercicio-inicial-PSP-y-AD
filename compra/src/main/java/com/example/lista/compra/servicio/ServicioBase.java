package com.example.lista.compra.servicio;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ServicioBase<T, ID, R extends JpaRepository<T, ID>> {

    /**
     * Almacenamos una nueva entidad a través del repositorio
     * @param t
     * @return
     */
    T save(T t);

    /**
     * Localizamos una entidad en base a su Id
     *
     * @param id
     * @return
     */
    Optional<T> findById(ID id);

    /**
     * Obtenemos todas las entidades de un tipo de entidad
     * @return
     */
    List<T> findAll();

    /**
     * Editamos una instancia de una entidad (si no tiene Id, la insertamos).
     * @param t
     * @return
     */
    T edit(T t);

    /**
     * Eliminamos una instancia de una entidad
     * @param t
     */
    void delete(T t);

    /**
     * Eliminamos una instancia en base a su ID
     * @param id
     */
    void deleteById(ID id);

}
