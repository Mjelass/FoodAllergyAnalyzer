const express = require('express')
const mysql = require('mysql')
const bodyParser = require('body-parser')

const app = express()
const port = 3000

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'whiteboard_app',
})

db.connect((err) => {
  if (err) {
    console.error('Error connecting to MySQL:', err)
    return
  }
  console.log('Connected to MySQL database')
})

app.use(bodyParser.json())

// Serve the HTML file
app.get('/', (req, res) => {
  res.sendFile(__dirname + '/public/index.html')
})

// Save drawing data to the database
app.post('/savedrawing', (req, res) => {
  const drawingData = req.body.drawingData
  const sql = 'INSERT INTO drawings (drawing_data) VALUES (?)'

  db.query(sql, [drawingData], (err, result) => {
    if (err) throw err
    res.send('Drawing saved successfully')
  })
})

// Retrieve drawing data from the database
app.get('/getdrawing', (req, res) => {
  const sql = 'SELECT drawing_data FROM drawings ORDER BY id DESC LIMIT 1'

  db.query(sql, (err, result) => {
    if (err) throw err
    if (result.length > 0) {
      res.send(result[0].drawing_data)
    } else {
      res.send('')
    }
  })
})

app.listen(port, () => {
  console.log(`Server is running on port ${port}`)
})
