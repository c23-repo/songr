package com.crepo.code401.wk3.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;


    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/albums/new")
    public String getAddAlbumForm() {
        return "albumForm";
    }

    @GetMapping("/songs/{albumID}/songGrabber")
    public String songGrabber(@PathVariable long albumID, Model model) {
        Album a = albumRepository.findById(albumID).get();
        List<Song>foundSong = a.getSongs();
        model.addAttribute("newSongs", foundSong);
        return "albumInfo";

    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount,
                                 @RequestParam int length, @RequestParam String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }
}
