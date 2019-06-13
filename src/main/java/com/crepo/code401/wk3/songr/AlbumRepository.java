package com.crepo.code401.wk3.songr;

import org.springframework.data.repository.CrudRepository;



// Setup Spring interaction with the Database to save and extract

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
