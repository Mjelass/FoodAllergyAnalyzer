document.addEventListener('DOMContentLoaded', () => {
  const canvas = document.getElementById('drawingCanvas')
  const ctx = canvas.getContext('2d')
  let drawing = false

  // Load previous drawing on page load
  $.get('/getdrawing', (data) => {
    if (data !== '') {
      const img = new Image()
      img.onload = () => {
        ctx.drawImage(img, 0, 0)
      }
      img.src = data
    }
  })

  canvas.addEventListener('mousedown', () => {
    drawing = true
  })

  canvas.addEventListener('mouseup', () => {
    drawing = false
    saveDrawing()
  })

  canvas.addEventListener('mousemove', (e) => {
    if (!drawing) return

    const rect = canvas.getBoundingClientRect()
    const x = e.clientX - rect.left
    const y = e.clientY - rect.top

    ctx.fillStyle = '#000'
    ctx.fillRect(x, y, 2, 2) // Adjust the size as needed
  })

  function saveDrawing() {
    const drawingData = canvas.toDataURL()
    $.post('/savedrawing', { drawingData }, (response) => {
      console.log(response)
    })
  }
})
