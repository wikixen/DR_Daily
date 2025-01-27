package com.wikixen.drdaily

import com.wikixen.drdaily.models.Article
import com.wikixen.drdaily.models.News
import com.wikixen.drdaily.models.Source

val sampleNews = News(
    articles = listOf(
        Article(
        author = "Joel Khalili",
        content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pretium orci in porttitor tristique. Ut quis viverra sem. Integer varius dapibus nulla, ac eleifend diam tempor at. Quisque id neque varius, aliquam lorem ac, fermentum ipsum. Praesent eget consequat metus. Donec molestie urna aliquam, rhoncus nibh posuere, laoreet odio. Aliquam lorem purus, molestie quis magna sit amet, auctor cursus mauris. Fusce tincidunt velit id lorem finibus, nec interdum leo viverra. Duis mattis quis est id pretium. Quisque dapibus tellus cursus, efficitur lacus in, laoreet dolor. Mauris dignissim quam sit amet mi viverra scelerisque. Nam fermentum eu nisi at auctor. In ullamcorper erat ut urna pharetra, condimentum lacinia erat euismod.",
        description = "Lorem ipsum dolor sit amet.",
        publishedAt = "2024-10-22T11:33:59Z",
        source = Source(id = "1", name = "Wired"),
        title = "Peter Todd Was ‘Unmasked’ as Bitcoin Creator Satoshi Nakamoto. Now He’s in Hiding",
        url = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
        urlToImage = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
        ),
        Article(
        author = "Andy Greenberg",
        content = "Nulla ut neque egestas, elementum sem sit amet, vulputate nisl. Nullam non congue elit. Aenean interdum lacus porta sollicitudin malesuada. In lacinia nec purus faucibus commodo. Maecenas dictum felis eu vehicula dignissim. Nullam dapibus imperdiet enim, eu dignissim nunc accumsan vitae. Etiam lacus sem, volutpat aliquet tincidunt at, molestie eget ante. Maecenas ut auctor elit, vitae cursus est. Ut placerat placerat rutrum.",
        description = "Lorem ipsum dolor sit amet, consectetur.",
        publishedAt = "2024-10-22T11:33:59Z",
        source = Source(id = "2", name = "Wired"),
        title = "Meet ZachXBT, the Masked Vigilante Tracking Down Billions in Crypto Scams and Thefts",
        url = "https://www.wired.com/story/meet-zachxbt-243-million-crypto-theft/",
        urlToImage = "https://media.wired.com/photos/671803d2124551b4eaed68ad/191:100/w_1280,c_limit/security_zachxbt_crypto_vigilante.jpg"
        ),
        Article(
        author = "Joel Khalili",
        content = "Ut vel ipsum quis erat rutrum vestibulum auctor a nisl. Quisque tincidunt tortor sem, auctor faucibus odio tincidunt a. Suspendisse nec gravida justo, sed aliquam lorem. Nulla facilisi. Vivamus venenatis consequat massa eget hendrerit. Nam bibendum nibh eget luctus condimentum. Sed et nisi sit amet dui elementum dapibus. Maecenas luctus ipsum vel neque porta, a cursus arcu facilisis. Nulla libero tellus, bibendum laoreet laoreet id, sodales ac ex. Nunc ut eros in magna volutpat pulvinar.",
        description = "Lorem ipsum dolor.",
        publishedAt = "2024-10-22T11:33:59Z",
        source = Source(id = "3", name = "Wired"),
        title = "As Trump Takes a Victory Lap, the Crypto Faithful Kiss the Ring",
        url = "https://www.wired.com/story/trump-crypto-support/",
        urlToImage = "https://media.wired.com/photos/672bda0a90a94384370310f4/191:100/w_1280,c_limit/business_crypto_faithful_trump.jpg"
        ),
        Article(
            author = "Joel Khalili",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pretium orci in porttitor tristique. Ut quis viverra sem. Integer varius dapibus nulla, ac eleifend diam tempor at. Quisque id neque varius, aliquam lorem ac, fermentum ipsum. Praesent eget consequat metus. Donec molestie urna aliquam, rhoncus nibh posuere, laoreet odio. Aliquam lorem purus, molestie quis magna sit amet, auctor cursus mauris. Fusce tincidunt velit id lorem finibus, nec interdum leo viverra. Duis mattis quis est id pretium. Quisque dapibus tellus cursus, efficitur lacus in, laoreet dolor. Mauris dignissim quam sit amet mi viverra scelerisque. Nam fermentum eu nisi at auctor. In ullamcorper erat ut urna pharetra, condimentum lacinia erat euismod.",
            description = "Lorem ipsum dolor sit amet.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "1", name = "Wired"),
            title = "Peter Todd Was ‘Unmasked’ as Bitcoin Creator Satoshi Nakamoto. Now He’s in Hiding",
            url = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
            urlToImage = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
        ),
        Article(
            author = "Andy Greenberg",
            content = "Nulla ut neque egestas, elementum sem sit amet, vulputate nisl. Nullam non congue elit. Aenean interdum lacus porta sollicitudin malesuada. In lacinia nec purus faucibus commodo. Maecenas dictum felis eu vehicula dignissim. Nullam dapibus imperdiet enim, eu dignissim nunc accumsan vitae. Etiam lacus sem, volutpat aliquet tincidunt at, molestie eget ante. Maecenas ut auctor elit, vitae cursus est. Ut placerat placerat rutrum.",
            description = "Lorem ipsum dolor sit amet, consectetur.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "2", name = "Wired"),
            title = "Meet ZachXBT, the Masked Vigilante Tracking Down Billions in Crypto Scams and Thefts",
            url = "https://www.wired.com/story/meet-zachxbt-243-million-crypto-theft/",
            urlToImage = "https://media.wired.com/photos/671803d2124551b4eaed68ad/191:100/w_1280,c_limit/security_zachxbt_crypto_vigilante.jpg"
        ),
        Article(
            author = "Joel Khalili",
            content = "Ut vel ipsum quis erat rutrum vestibulum auctor a nisl. Quisque tincidunt tortor sem, auctor faucibus odio tincidunt a. Suspendisse nec gravida justo, sed aliquam lorem. Nulla facilisi. Vivamus venenatis consequat massa eget hendrerit. Nam bibendum nibh eget luctus condimentum. Sed et nisi sit amet dui elementum dapibus. Maecenas luctus ipsum vel neque porta, a cursus arcu facilisis. Nulla libero tellus, bibendum laoreet laoreet id, sodales ac ex. Nunc ut eros in magna volutpat pulvinar.",
            description = "Lorem ipsum dolor.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "3", name = "Wired"),
            title = "As Trump Takes a Victory Lap, the Crypto Faithful Kiss the Ring",
            url = "https://www.wired.com/story/trump-crypto-support/",
            urlToImage = "https://media.wired.com/photos/672bda0a90a94384370310f4/191:100/w_1280,c_limit/business_crypto_faithful_trump.jpg"
        ),
        Article(
            author = "Joel Khalili",
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pretium orci in porttitor tristique. Ut quis viverra sem. Integer varius dapibus nulla, ac eleifend diam tempor at. Quisque id neque varius, aliquam lorem ac, fermentum ipsum. Praesent eget consequat metus. Donec molestie urna aliquam, rhoncus nibh posuere, laoreet odio. Aliquam lorem purus, molestie quis magna sit amet, auctor cursus mauris. Fusce tincidunt velit id lorem finibus, nec interdum leo viverra. Duis mattis quis est id pretium. Quisque dapibus tellus cursus, efficitur lacus in, laoreet dolor. Mauris dignissim quam sit amet mi viverra scelerisque. Nam fermentum eu nisi at auctor. In ullamcorper erat ut urna pharetra, condimentum lacinia erat euismod.",
            description = "Lorem ipsum dolor sit amet.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "1", name = "Wired"),
            title = "Peter Todd Was ‘Unmasked’ as Bitcoin Creator Satoshi Nakamoto. Now He’s in Hiding",
            url = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
            urlToImage = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
        ),
        Article(
            author = "Andy Greenberg",
            content = "Nulla ut neque egestas, elementum sem sit amet, vulputate nisl. Nullam non congue elit. Aenean interdum lacus porta sollicitudin malesuada. In lacinia nec purus faucibus commodo. Maecenas dictum felis eu vehicula dignissim. Nullam dapibus imperdiet enim, eu dignissim nunc accumsan vitae. Etiam lacus sem, volutpat aliquet tincidunt at, molestie eget ante. Maecenas ut auctor elit, vitae cursus est. Ut placerat placerat rutrum.",
            description = "Lorem ipsum dolor sit amet, consectetur.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "2", name = "Wired"),
            title = "Meet ZachXBT, the Masked Vigilante Tracking Down Billions in Crypto Scams and Thefts",
            url = "https://www.wired.com/story/meet-zachxbt-243-million-crypto-theft/",
            urlToImage = "https://media.wired.com/photos/671803d2124551b4eaed68ad/191:100/w_1280,c_limit/security_zachxbt_crypto_vigilante.jpg"
        ),
        Article(
            author = "Joel Khalili",
            content = "Ut vel ipsum quis erat rutrum vestibulum auctor a nisl. Quisque tincidunt tortor sem, auctor faucibus odio tincidunt a. Suspendisse nec gravida justo, sed aliquam lorem. Nulla facilisi. Vivamus venenatis consequat massa eget hendrerit. Nam bibendum nibh eget luctus condimentum. Sed et nisi sit amet dui elementum dapibus. Maecenas luctus ipsum vel neque porta, a cursus arcu facilisis. Nulla libero tellus, bibendum laoreet laoreet id, sodales ac ex. Nunc ut eros in magna volutpat pulvinar.",
            description = "Lorem ipsum dolor.",
            publishedAt = "2024-10-22T11:33:59Z",
            source = Source(id = "3", name = "Wired"),
            title = "As Trump Takes a Victory Lap, the Crypto Faithful Kiss the Ring",
            url = "https://www.wired.com/story/trump-crypto-support/",
            urlToImage = "https://media.wired.com/photos/672bda0a90a94384370310f4/191:100/w_1280,c_limit/business_crypto_faithful_trump.jpg"
        ),
    ),
    status = "ok",
    totalResults = 9
)

val sampleArticle = Article(
    author = "Joel Khalili",
    content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pretium orci in porttitor tristique. Ut quis viverra sem. Integer varius dapibus nulla, ac eleifend diam tempor at. Quisque id neque varius, aliquam lorem ac, fermentum ipsum. Praesent eget consequat metus. Donec molestie urna aliquam, rhoncus nibh posuere, laoreet odio. Aliquam lorem purus, molestie quis magna sit amet, auctor cursus mauris. Fusce tincidunt velit id lorem finibus, nec interdum leo viverra. Duis mattis quis est id pretium. Quisque dapibus tellus cursus, efficitur lacus in, laoreet dolor. Mauris dignissim quam sit amet mi viverra scelerisque. Nam fermentum eu nisi at auctor. In ullamcorper erat ut urna pharetra, condimentum lacinia erat euismod.",
    description = "Lorem ipsum dolor sit amet.",
    publishedAt = "2024-10-22T11:33:59Z",
    source = Source(id = "1", name = "Wired"),
    title = "Peter Todd Was ‘Unmasked’ as Bitcoin Creator Satoshi Nakamoto. Now He’s in Hiding",
    url = "https://www.wired.com/story/peter-todd-was-unmasked-as-bitcoin-creator-satoshi-nakamoto-now-hes-in-hiding/",
    urlToImage = "https://media.wired.com/photos/6716870e6874cb5feda0798e/191:100/w_1280,c_limit/102124-bitcoin-satoshi-an.jpg"
)