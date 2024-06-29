package com.cafecitodev.cafecitod;

import com.cafecitodev.cafecitod.entity.Song;
import com.cafecitodev.cafecitod.repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CafecitodApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafecitodApplication.class, args);
	}

	// Permitira registros de prueba en cuanto se inicie la ejecucion del proyecto
	@Bean
	CommandLineRunner runner(SongRepository songRepository) {
		return args -> {
			List<Song> songs = Arrays.asList(
					new Song("Shape of You","A popular song by Ed Sheeran from his album '÷' (2017).", "https://imgmedia.larepublica.pe/640x371/larepublica/original/2021/12/23/61c3ea3c31e39940490d8e94.webp", "Ed Sheeran", LocalDateTime.now()),
					new Song("Blinding Lights","A hit song by The Weeknd from his album 'After Hours' (2020).", "https://media.revistagq.com/photos/63b2a333cf946a6d514db968/4:3/w_2132,h_1599,c_limit/blinding-lights-the-weeknd-spotify.jpeg", "The Weeknd", LocalDateTime.now()),
					new Song("Bad Guy","A song by Billie Eilish from her album 'When We All Fall Asleep, Where Do We Go?' (2019).", "https://i.ytimg.com/vi/4-TbQnONe_w/maxresdefault.jpg", "Billie Eilish", LocalDateTime.now()),
					new Song("Uptown Funk","A song by Mark Ronson featuring Bruno Mars from the album 'Uptown Special' (2014).", "https://i.ytimg.com/vi/OPf0YbXqDm0/maxresdefault.jpg", "Mark Ronson ft. Bruno Mars", LocalDateTime.now()),
					new Song("Someone Like You","A song by Adele from her album '21' (2011).", "https://universalsonica.org/wp-content/uploads/2024/02/efemerides-88-1100x733.jpg", "Adele", LocalDateTime.now()),
					new Song("Thinking Out Loud","A romantic ballad by Ed Sheeran from his album 'x' (2014).", "https://i.ytimg.com/vi/hLQl3WQQoQ0/maxresdefault.jpg", "Ed Sheeran", LocalDateTime.now())
			);

			songRepository.saveAll(songs);
		};
	};
}
