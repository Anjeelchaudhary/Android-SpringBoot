import { useState } from 'react'
import Navbar from './component/Navbar'

function App() {
  const [count, setCount] = useState(0)

  return <Navbar/>
}

export default App
