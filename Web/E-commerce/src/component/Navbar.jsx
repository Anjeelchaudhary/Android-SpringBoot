import React from 'react'
import { FaFacebookSquare, FaGit } from 'react-icons/fa';

const Navbar = () => {
  return (
    <>
      <nav className=''>
        <div className='justify-content: space-between bg-white-700 flex flex-row '>
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