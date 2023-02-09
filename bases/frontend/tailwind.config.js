module.exports = {
  mode: 'jit',
  content: process.env.NODE_ENV == 'production' ? ["./release/main.js"] : ["./public/js/cljs-runtime/*.js"],
  darkMode: 'class', // or 'media' or 'class'
}
