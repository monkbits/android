// how to getch image from internet


try {
  ImageView i = (ImageView)findViewById(R.id.image);
  Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(imageUrl).getContent());
  i.setImageBitmap(bitmap); 
} catch (MalformedURLException e) {
  e.printStackTrace();
} catch (IOException e) {
  e.printStackTrace();
}


// you can use piccassso as well

Picasso.with(context)
                     .load("http://ImageURL")
                     .resize(width,height)
                     .into(imageView );
