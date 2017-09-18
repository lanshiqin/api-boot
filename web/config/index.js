// see http://vuejs-templates.github.io/webpack for documentation.
var path = require('path')

var assetsRoot = path.resolve(__dirname, '../build/resources/main/static')// <-----1.添加

module.exports = {
  build: {
    env: require('./prod.env'),
    index: path.resolve(assetsRoot, 'index.html'),  // <-----2.修改
    assetsRoot: assetsRoot, // <-----3.修改
    assetsSubDirectory: 'assets', // <-----4.修改
    assetsPublicPath: '/',
    productionSourceMap: true,
    // Gzip off by default as many popular static hosts such as
    // Surge or Netlify already gzip all static assets for you.
    // Before setting to `true`, make sure to:
    // npm install --save-dev compression-webpack-plugin
    productionGzip: false,
    productionGzipExtensions: ['js', 'css'],
    // Run the build command with an extra argument to
    // View the bundle analyzer report after build finishes:
    // `npm run build --report`
    // Set to `true` or `false` to always turn it on or off
    bundleAnalyzerReport: process.env.npm_config_report
  },
  dev: {
    env: require('./dev.env'),
    port: 3000, // <-----5.修改
    autoOpenBrowser: true,
    assetsSubDirectory: 'assets', // <-----6.修改
    assetsPublicPath: '/',
    proxyTable: { // <-----7.修改
      '/api/**': 'http://localhost:8080'//代理前台/api开头的请求，代理到8080端口，spring boot的访问端口
    },
    // CSS Sourcemaps off by default because relative paths are "buggy"
    // with this option, according to the CSS-Loader README
    // (https://github.com/webpack/css-loader#sourcemaps)
    // In our experience, they generally work as expected,
    // just be aware of this issue when enabling this option.
    cssSourceMap: false
  }
}
