import com.example.bookshelf.model.BookShelf
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApiService {
    @GET("volumes")
    suspend fun searchBooks(@Query("q") query: String): Response<BookResponse>
}

@Serializable
data class BookResponse(
    @SerialName("items")
    val books: List<BookShelf>
)
