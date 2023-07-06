import React from 'react'
import { FaFacebookSquare, FaGit } from 'react-icons/fa';

const Navbar = () => {
  return (
    <>
      <nav className='bg-green-800 py-4'>
        <div className='container mx-auto flex justify-between items-center '>
          {/* !st part logouploading part */}
          <div className='logo'>
            <h2>
              <span>O</span>nline
              <span>S</span>tore
            </h2>
          </div>
          {/* 2nd menubar part*/}
          <div className='menu-list'>
            <ul>
              <li><a href="#">Home</a></li>
            </ul>
            <ul>
              <li><a href="#">Search</a></li>
            </ul>
            <ul>
              <li><a href="#">ProductDetail</a></li>
            </ul>
          </div>
          {/* 3rd socialMediaUploadingPart */}
          <div className='social-media'>
            <li><a href="https://www.facebook.com/an.zeel.75"><FaFacebookSquare /></a></li>
            <li><a href="https://github.com/Anjeelchaudhary"><FaGit /></a></li>
          </div>
        </div>
      </nav>

    </>
  )
}

export default Navbar