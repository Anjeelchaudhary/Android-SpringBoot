import { useState } from 'react'
import { Route, Routes } from 'react-router-dom'
import { PageRoutes } from './enum/routs.enum'
import Home from './pages/Home/Home'
import Navbar from './component/Navbar'
import Search from './pages/search/Search'
import ProductDetail from './pages/productDetails/ProductDetail'

function App() {
  const [count, setCount] = useState(0)
  return <>
    <Navbar>

    </Navbar>
    <Routes>
      <Route path={PageRoutes.HOME} element={<Home />} />
      <Route path={PageRoutes.SEARCH} element={<Search />} />
      <Route path={PageRoutes.PRODUCTDETAIL} element={<ProductDetail />} />
    </Routes >
  </>
}

export default App
