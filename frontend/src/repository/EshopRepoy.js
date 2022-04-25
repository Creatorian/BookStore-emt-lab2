import axios from '../custom-axios/axios';

const EShopService = {

    getBook: (id) => {
        return axios.get(`/books/${id}`);
    },

    fetchBooks: () => {
        return axios.get("/books");
    },

    fetchAuthors: () => {
        return axios.get("/authors");
    },

    fetchCountries: () => {
        return axios.get("/country");
    },

    addBook: (name, category, author, availableCopies) => {
        return axios.post("/books/add", {
            "name" : name,
            "category" : category,
            "author" : author,
            "availableCopies" : availableCopies
        });
    },

    deleteBook: (id) => {
        return axios.delete(`/books/delete/${id}`);
    }
}

export default EShopService;