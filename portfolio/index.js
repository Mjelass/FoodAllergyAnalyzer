'use strinct'
const path = require('path')
const express = require('express')
const { dirname } = require('path')
const bodyParser = require('body-parser')
require('dotenv').config()
const PORT = process.env.PORT || 3000

const app = express()
app.set('view engine', 'ejs')
app.set('views', path.join(__dirname, 'views'))



//req.body
app.use(bodyParser.urlencoded({extended:false}))





//fichero estaticos
const FicherosEstaticos = path.join(__dirname, 'public')
app.use(express.static(FicherosEstaticos))

app.get("/",function(req,res){
 res.render("index",{})
});



app.listen(PORT, function (err) {
  if (err) {
    console.error('No se puede inicializar el servidor : ' + err.message)
  } else {
    console.log('Servidor arrancado en el Puerto ' + PORT)
  }
})
