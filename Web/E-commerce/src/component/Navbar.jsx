import React from 'react'
import { FaFacebookSquare, FaGit } from 'react-icons/fa';
import { Link } from 'react-router-dom';
import { PageRoutes } from '../enum/routs.enum';

const Navbar = () => {
  return (
    <>
      <nav className='bg-green-800 py-4'>
        <div className='container mx-auto flex justify-between items-center text-white'>
          {/* !st part logouploading part */}
          <div className='logo'>
            <h2>
              <span>O</span>nline
              <span>S</span>tore
            </h2>
          </div>
          {/* 2nd menubar part*/}
          <div className='flex justify-around items-centre'>
            <ul>
              <Link to={PageRoutes.HOME}> <li className='px-3'>Home</li></Link>
            </ul>
            <ul>
              <Link to={PageRoutes.SEARCH}><li className='px-3'>Search</li></Link>
            </ul>
            <ul>
              <Link to={PageRoutes.PRODUCTDETAIL}><li className='px-3'>ProductDetails</li></Link>
            </ul>
          </div>
          {/* 3rd socialMediaUploadingPart */}
          <div className='flex justify-around items-centre decoration-none'>
            <div className='px-3'><a href="https://www.facebook.com/an.zeel.75"><FaFacebookSquare /></a></div>
            <div className='px-3'><a href="https://github.com/Anjeelchaudhary"><FaGit /></a></div>
          </div>
        </div>
      </nav>

    </>
  )
}

export default Navbar